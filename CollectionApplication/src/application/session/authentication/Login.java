package application.session.authentication;

/*
 * @author vikram wankhede
 * @date 8/5/2015
 */

// Login class used for verification of client credentials
public class Login {
    
    String userName;
    String displayName;
    String role;
    boolean isAuthenticated;
    String [] groups;

    // Deafault constructor
    public Login() 
    {
        super();
    }

    // This method is used to get the security information
    public void securityInfo (String userName, String displayName, String role, boolean isAuthenticated, String[] groups) {
        
        this.userName = userName;
        this.displayName = displayName;
        this.role = role;
        this.isAuthenticated = isAuthenticated;
        this.groups = groups;
    }
    
    // setter method for usename
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // getter method for usename
    public String getUserName() {
        return userName;
    }

    // setter method for diplayname
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    // getter method for diplayname
    public String getDisplayName() {
        return displayName;
    }

    // setter method to set the rule
    public void setRole(String role) {
        this.role = role;
    }

    // getter method for role
    public String getRole() {
        return role;
    }
    
    // setter method used to set boolean value
    public void setIsAuthenticated(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }
    
    // getter method to get the boolean value
    public boolean isIsAuthenticated() {
        return isAuthenticated;
    }

    // setter method used to set the groups
    public void setGroups(String[] groups) {
        this.groups = groups;
    }

    // getter method to get groups
    public String[] getGroups() {
        return groups;
    }

}
