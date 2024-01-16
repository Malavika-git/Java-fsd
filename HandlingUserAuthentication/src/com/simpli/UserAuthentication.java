package com.simpli;

public class UserAuthentication {
	  // Simulated user credentials for demonstration
    private static final String VALID_USERNAME = "testUser";
    private static final String VALID_PASSWORD = "testPassword";

    public boolean authenticateUser1(String username, String password) {
        // Simulate authentication logic with a hardcoded valid username and password
        return VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password);
    }

}

