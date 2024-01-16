package com.simpli;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class UserAuthenticationTest {

    @Test
    public void testAuthenticateUser() {
        // Arrange
        UserAuthentication userAuth = new UserAuthentication();

        // Act
        // Test case: Valid authentication
        boolean result = userAuth.authenticateUser1("testUser", "testPassword");

        // Assert
        assertTrue(result);
    }
}