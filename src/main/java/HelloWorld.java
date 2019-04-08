import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {

    /*
    @GET
    @Path("/{param}")
    @Produces("text/plain")
    public Response getMessage(@PathParam("param") String msg) {
        String output = "Hello " + msg;
        return Response.status(200).entity(output).build();
    }
    */

    /*
    @GET
    @Path("/{param}")
    @Produces("application/json")
    public Response getMessageJSON(@PathParam("param") String msg) {
        String output = "Hello " + msg;
        return Response.status(200).entity(output).build();
    }
    */

    @GET
    @Path("/{param}")
    @Produces("text/html")
    public Response getMessageXML(@PathParam("param") String msg) {
        String output = "Hello " + msg;
        return Response.status(200).entity(output).build();
    }

}
