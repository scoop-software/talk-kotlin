package de.scoopsoftware.demo

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.SchemaUtils.create
import org.jetbrains.exposed.dao.*

object CountryTable : IntIdTable() {
    val name = varchar("name", 250).uniqueIndex()
    val iso = varchar("iso", 2).uniqueIndex()
}

class Country(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Country>(CountryTable)
    var name: String by CountryTable.name
    var iso: String by CountryTable.iso
}

fun main(args: Array<String>) {
    Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver")
    transaction {
        logger.addLogger(StdOutSqlLogger)
        create (CountryTable)

        Country.new { name = "Germany"; iso = "de" }
        Country.new { name = "Russia"; iso = "ru" }
        Country.new { name = "United States"; iso = "us" }

        val russia = Country.find {
            CountryTable.iso.eq("ru")
        }.first()

        println(russia.name)
    }
}

