package com.examples.camel.cxf.rest;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//@Path("/expr")
@WebService
public interface Excepintf
{
   @GET
  // @Path("/exp")
   @Produces(MediaType.TEXT_PLAIN)
   public Response exp();
 
}
