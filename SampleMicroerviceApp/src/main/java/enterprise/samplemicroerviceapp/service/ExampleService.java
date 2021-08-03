package enterprise.samplemicroerviceapp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/example")
public class ExampleService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Remote Client Call - Hello, world of Micro Services from Example Service!";
    }

}
