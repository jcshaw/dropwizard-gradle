package com.jcshaw.dropwizard.gradle.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/application")
public class ApplicationResource {
    @GET
    @Path("/greeting/{name}")
    public String getGreeting(@PathParam("name") String name) {
        return "Hello " + name;
    }

}
