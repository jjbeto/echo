package com.jjbeto.echo;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class EchoResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response echo(@QueryParam("wait") long wait) {
        try {
            MILLISECONDS.sleep(wait);
            return Response.ok("Nothing to say =(").build();
        } catch (InterruptedException e) {
            return Response.serverError().build();
        }
    }

    @GET
    @Path("/{text}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response echo(@PathParam("text") String text, @QueryParam("wait") long wait) {
        try {
            MILLISECONDS.sleep(wait);
            return Response.ok(text).build();
        } catch (InterruptedException e) {
            return Response.serverError().build();
        }
    }

}
