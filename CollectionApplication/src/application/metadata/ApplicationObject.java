package application.metadata;

/*
 * @author vikram wankhede
 * @date 8/5/2015
 */

// This class is used to make up the application
public class ApplicationObject {
    String applicationId;
    String id;
    String database;

    // Method used to set the application object
    public void setApplicationObjectBinary(String applicationId, String id, String database) {
        this.database = database;
        this.applicationId = applicationId;
        this.id = id;
    }

    // Method used to get the application object
    public void getApplicationObjectBinary(String applicationId, String id) {
        this.applicationId = applicationId;
        this.id = id;
    }
}
