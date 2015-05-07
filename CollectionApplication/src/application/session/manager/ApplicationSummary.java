package application.session.manager;
/*
 * @author vikram wankhede
 * @date 4/5/2015
 */

import java.util.ArrayList;
import java.util.List;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
// Collection web service
public class ApplicationSummary {
    List<Application> application = new ArrayList<Application>();

    public ApplicationSummary() {
        super();
    }

    @WebMethod
    @Oneway
    // This method is used to set  application details
    public void setApplication(@WebParam(name = "arg0") List<Application> application) {
        this.application = application;
    }

    @WebMethod
    // This method is used to get details of all applications
    public List<Application> getApplications() {
        if (application.size() == 0) {
            application.add(new Application("Archieve", "Archieve", Authentication.AdlibDatabase, Language.English));
            application.add(new Application("Museum", "Museum", Authentication.AdlibPbk, Language.English));
            application.add(new Application("Library", "Library", Authentication.ActiveDirectory, Language.English));
            application.add(new Application("Films", "Films", Authentication.AdlibPbk, Language.English));
            application.add(new Application("Music", "Music", Authentication.HTTP, Language.English));
        }
        return application;
    }

    @WebMethod
    // This method is used to add details of new application
    public boolean addApplication(@WebParam(name = "arg0") Application app) {
        return application.add(app);
    }
}
