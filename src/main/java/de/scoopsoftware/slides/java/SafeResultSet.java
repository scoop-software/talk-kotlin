package de.scoopsoftware.slides.java;

import java.sql.ResultSet;

public class SafeResultSet /* implements ResultSet */ {
    private final ResultSet rs;

    public SafeResultSet(ResultSet rs) {
        this.rs = rs;
    }
}
