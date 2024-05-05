package com.example.jaxrstesting;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api/v1")
public class JaxRsConfig extends ResourceConfig {

  public JaxRsConfig() {
    register( DemoController.class );
  }

}
