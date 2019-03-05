package de.scoopsoftware.demo

import java.sql.Connection
import java.sql.ResultSet

interface QueryExecutor {
    fun execute(sql: String): ResultSet
}

class QueryExecutorImpl(val connectionProvider: () -> Connection): QueryExecutor {
    override fun execute(sql: String): ResultSet = connectionProvider().createStatement().executeQuery(sql)
}

class SafeResultSet(val rs: ResultSet) : ResultSet by rs {
    override fun getString(columnLabel: String?): String =
            if(columnLabel!!.toLowerCase().contains("password")) "***" else rs.getString(columnLabel)

    override fun getString(columnIndex: Int): String = getString(rs.metaData.getColumnLabel(columnIndex))
}
