package application.settings;

/*
 * @author vikram wankhede
 * @date 8/5/2015
 */

// This class is used to configure the user settings
public class UserSetting {
    String applicationId;
    String id;
    String database;
    
    // This method is used to get the user Settings
    public void getUserSettings(String applicationId, String id, String database) {
        this.applicationId = applicationId;
        this.database = database;
        this.id = id;
        
    }
    // This method is used to set the user settings
    public void setUserSettings(String applicationId, String id, String database) {
        this.applicationId = applicationId;
        this.id = id;
        this.database = database;
        
    }
    // This method is used to delete the user settings
    public void deleteUserSettings(String applicationId, String id, String database) {
        this.applicationId = applicationId;
        this.id = id;
        this.database = database;   
    
    }
}