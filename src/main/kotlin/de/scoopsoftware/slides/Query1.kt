package de.scoopsoftware.slides.v1

//tag::content[]
import java.sql.Connection
import java.sql.ResultSet

interface QueryExecutor {
    fun execute(sql: String): ResultSet
}

class QueryExecutorImpl(val connectionProvider: () -> Connection): QueryExecutor {
    override fun execute(sql: String): ResultSet =
            connectionProvider().createStatement().executeQuery(sql)
}








// Change request: the returned ResultSet should mask the values from password-containing columns
//end::content[]
