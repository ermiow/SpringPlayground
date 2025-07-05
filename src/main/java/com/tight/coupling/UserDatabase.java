package com.tight.coupling;

// A - MySQL, PostgreSQL
// B - Web Service, MongoDB

public class UserDatabase {
    public String getUserDetails() {
        // Directly accessing DB
        return "User Details From Database";
    }
}
