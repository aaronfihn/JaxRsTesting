package com.example.jaxrstesting;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import org.springframework.stereotype.Controller;

@Controller
@Path("/greetings")
public class DemoController {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response getGreeting() {
    String s = "{ \"message\": \"hello world\" }";
    return Response.ok(s).build();
  }

}
