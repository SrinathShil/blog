package com.examples.camel.cxf.rest;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@WebService
public interface HelloWorldIntf
{
   @GET
   @Path("/greet")
   @Produces(MediaType.TEXT_PLAIN)
   public Response greet();
 
   @POST
   @Path("/sayhello")
   @Produces(MediaType.APPLICATION_JSON)
   public Response sayHello(String input);
}
