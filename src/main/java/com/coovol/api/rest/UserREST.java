package com.coovol.api.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;


@Path("/users")
@ApplicationScoped
public class UserREST {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public void create(@Suspended final AsyncResponse asyncResponse) {

    asyncResponse.resume("{}");
  }
}
