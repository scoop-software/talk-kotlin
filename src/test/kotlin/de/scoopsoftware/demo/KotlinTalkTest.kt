package de.scoopsoftware.demo
import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.ShouldSpec

class KotlinTalkTest : ShouldSpec() {
    init {
        should("correctly compute 1 + 1") {
            1 + 1 shouldBe 2
        }
    }
}
