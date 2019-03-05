import com.github.jrubygradle.JRubyPrepare
import org.asciidoctor.gradle.AsciidoctorTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.api.Task
import org.gradle.jvm.tasks.Jar
import org.ysb33r.groovy.dsl.vfs.VFS

buildscript {
    dependencies {
        classpath("org.ysb33r.gradle:vfs-gradle-plugin:1.0")
        classpath("commons-httpclient:commons-httpclient:3.1")
    }
}

val version: String by project
val deckjsVersion: String by project
val asciidoctorBackendVersion: String by project
val downloadDir = File(buildDir,"download")
val templateDir = File(downloadDir,"templates")
val deckjsTmpDir = File(downloadDir,"deck.js.tmp")
val deckjsDir = File(downloadDir,"deck.js")
val deckjsVersionDir = File(downloadDir,"deck.js-master")

plugins {
    application
    kotlin("jvm") version "1.2.31"
    id("org.jetbrains.dokka") version "0.9.16"
    id("org.asciidoctor.convert") version "1.6.0"
    id("com.github.jruby-gradle.base") version "1.6.0"
    id("org.openjfx.javafxplugin") version "0.0.7"
}

repositories {
    jcenter()
    maven("https://dl.bintray.com/kotlin/exposed")
}

apply {
    plugin("application")
    plugin("org.jetbrains.dokka")
    plugin("com.github.jruby-gradle.base")
    plugin("org.ysb33r.vfs")
    plugin("org.asciidoctor.convert")
}
java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
group = "de.scoopsoftware"

javafx {
    modules = listOf("javafx.controls", "javafx.fxml")
}

dependencies {
    compile(kotlin("reflect"))
    compile(kotlin("stdlib"))
    compile("org.slf4j:slf4j-simple:1.7.25")
    compile("org.jetbrains.exposed:exposed:0.10.1")
    compile("com.h2database:h2:1.4.197")
    compile("io.javalin:javalin:1.4.1")
    compile("no.tornado:tornadofx:1.7.15")
    testCompile("io.kotlintest:kotlintest:2.0.7")
    gems("rubygems:haml:5.0.4")
    jrubyExec("org.jruby:jruby-complete:9.2.6.0")
}

tasks {
    register("download") {
        doLast {
            mkdir(downloadDir!!)
            with(VFS()) {
                cp(mapOf("recursive" to true, "overwrite" to true, "smash" to true),
                        "zip:https://github.com/asciidoctor/asciidoctor-deck.js/archive/${asciidoctorBackendVersion}.zip!asciidoctor-deck.js-${asciidoctorBackendVersion}/templates",
                        templateDir)
                cp(mapOf("recursive" to true, "overwrite" to true, "smash" to true),
                        "zip:https://github.com/imakewebthings/deck.js/archive/${deckjsVersion}.zip!deck.js-${deckjsVersion}",
                        deckjsDir)
            }
            deckjsVersionDir.renameTo(deckjsDir)
        }
    }
}
val downloadTask = tasks.get("download")
val jrubyPrepare = tasks.get("jrubyPrepare")

with(downloadTask) {
    description = "Download extra deckjs resources"
    outputs.dirs(templateDir, deckjsDir)
}

tasks.withType<Jar> {
    manifest {
        attributes(mapOf(
                "Implementation-Title" to "kotlinTalk",
                "Main-Class" to "de.scoopsoftware.kotlintalk.HelloWeb",
                "Implementation-Version" to version
        ))
    }
}

tasks.withType<AsciidoctorTask> {
    dependsOn(jrubyPrepare, downloadTask)

    sources(delegateClosureOf<PatternSet> {
        include("kotlin-slides.adoc")
    })

    resources(delegateClosureOf<CopySpec> {
        from (sourceDir) { include("images/**", "deck.js/**") }
        from (downloadDir) { include("deck.js/**") }
    })

    backends("html5")

    attributes.putAll(mapOf(
            "prjdir" to "${project.rootDir}",
            "sourcedir" to "${project.rootDir}/src/main",
            "imagesdir" to "./images"
    ))

    options(mapOf("template_dirs" to listOf(File(templateDir,"haml").absolutePath)))
}

application {
    mainClassName = "de.scoopsoftware.kotlintalk.HelloWeb"
}

tasks.register("bar") {
    group = "sample"
    doLast { println("Bar!") }
}
