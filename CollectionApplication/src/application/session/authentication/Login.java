package application.session.authentication;

public class Login {
    
    String userName;
    String displayName;
    String role;
    boolean isAuthenticated;
    String [] groups;

    public Login() 
    {
        super();
    }

    public Login(String userName, String displayName, String role, boolean isAuthenticated, String[] groups) {
        
        this.userName = userName;
        this.displayName = displayName;
        this.role = role;
        this.isAuthenticated = isAuthenticated;
        this.groups = groups;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setIsAuthenticated(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

    public boolean isIsAuthenticated() {
        return isAuthenticated;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }

    public String[] getGroups() {
        return groups;
    }

   
    public void securityInfo() {
        
    }
}
