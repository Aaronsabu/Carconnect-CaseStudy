package com.hexaware.carconnect;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {
    private Map<String, String> credentials; // Simulating stored credentials (username, password)
    private Map<String, Boolean> loggedInUsers; // Tracks logged-in status

    public AuthenticationService() {
        this.credentials = new HashMap<>();
        this.loggedInUsers = new HashMap<>();

        credentials.put("user1", "password1");
        credentials.put("user2", "password2");
    }
    
    public boolean login(String username, String password) throws AuthenticationException  {
        if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
            loggedInUsers.put(username, true);
            System.out.println("User '" + username + "' logged in successfully.");
            return true;
        }
        throw new AuthenticationException("Incorrect username or password.");
    }
    
    public void logout(String username) {
        if (loggedInUsers.containsKey(username)) {
            loggedInUsers.put(username, false);
            System.out.println("User '" + username + "' logged out.");
        } else {
            System.out.println("User '" + username + "' is not logged in.");
        }
    }

    public boolean isLoggedIn(String username) {
        return loggedInUsers.getOrDefault(username, false);
    }
}
