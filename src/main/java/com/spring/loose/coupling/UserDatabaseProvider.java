package com.spring.loose.coupling;

// A - MySQL, PostgreSQL
// B - Web Service, MongoDB

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        // Directly accessing DB
        return "User Details From Database";
    }
}
