package org.acme;

import java.net.http.HttpRequest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/pouet")
public class GreetingPost {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String pouet(HttpRequest request) {
        return request.toString();
    }
}