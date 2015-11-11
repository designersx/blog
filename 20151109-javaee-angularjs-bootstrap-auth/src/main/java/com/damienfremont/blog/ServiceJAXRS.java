package com.damienfremont.blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/data")
public class ServiceJAXRS {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String get() {
    // TODO auth
    return "content";
  }  

}