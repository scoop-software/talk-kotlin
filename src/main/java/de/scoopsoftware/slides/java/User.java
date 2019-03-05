package de.scoopsoftware.slides.java;

//tag::content[]
// Java
public class User {
    private final String id;
    private String email;

    public User(String id) { this.id = java.util.Objects.requireNonNull(id); }

    public String getId() { return id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
//end::content[]
