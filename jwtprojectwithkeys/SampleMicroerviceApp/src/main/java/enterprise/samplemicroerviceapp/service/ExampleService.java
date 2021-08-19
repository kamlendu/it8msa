package enterprise.samplemicroerviceapp.service;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/example")
public class ExampleService {

    @GET
    @RolesAllowed("Admin")
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "MyKeys Admin: Remote Client Call - Hello, world of Micro Services from Example Service!";
    }

}
