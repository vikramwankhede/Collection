package application.session.manager;
/*
 * @author vikram wankhede
 * @date 4/5/2015
 */

// This class contains fields,getter and setter methods                              
public class Application 
{                  
    String Id;
    String Name;
    Language language;
    Authentication authentication;
   
    // Default constructor
    public Application() {
        super();
    }

    // Parameterised constructor
    public Application(String Id, String Name, Authentication type  , Language lang) {
        this.Id = Id;
        this.Name = Name;
        this.authentication = type;
        this.language = lang;
    }

    // Setter method for ID
    public void setId(String Id) {
        this.Id = Id;
    }
    // Getter method for ID
    public String getId() {
        return Id;
    }
    // Setter method for name
    public void setName(String Name) {
        this.Name = Name;
    }
    // Getter method for name
    public String getName() {
        return Name;
    }
    // Setter method for authentication
    public void setAuthenticationType(Authentication type) {
        this.authentication = type;  
    }
    // Getter method for authentication
    public Authentication  getAuthenticationType() {
        return authentication;
    }
    // Setter method for language
    public void setLanguageType(Language lang) {
        this.language = lang;
    }
    // Getter method for language
    public Language getLanguageType() {
        return language;
    }
}
