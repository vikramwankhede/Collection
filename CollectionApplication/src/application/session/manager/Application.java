package application.session.manager;

public class Application 
{
    String Id;
    String Name;
    Language language;
    Authentication authentication;
   
    public Application() {
        super();
    }

    public Application(String Id, String Name, Authentication type  , Language lang) {
        this.Id = Id;
        this.Name = Name;
        this.authentication = type;
        this.language = lang;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getId() {
        return Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setAuthenticationType(Authentication type) {
        this.authentication = type;  
    }

    public Authentication  getAuthenticationType() {
        return authentication;
    }

    public void setLanguageType(Language lang) {
        this.language = lang;
    }

    public Language getLanguageType() {
        return language;
    }
}
