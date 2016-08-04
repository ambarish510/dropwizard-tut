package com.dwtemplate.asb.jersey;

import com.dwtemplate.asb.dropwizard.ManagerConfiguration;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class HelloResource {

  private final ManagerConfiguration managerConfiguration;

  public HelloResource(ManagerConfiguration managerConfiguration) {
    this.managerConfiguration = managerConfiguration;
  }

  @GET
  public String welcome(@QueryParam("name") @DefaultValue("stranger") String name) {
    return "Hello " + name + ", Welcome to " + managerConfiguration.getName() + " Application";
  }
}
