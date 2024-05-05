package com.example.jaxrstesting;

import jakarta.ws.rs.ApplicationPath;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api/v1")
public class JaxRsConfig extends jakarta.ws.rs.core.Application {
  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> resources = new HashSet<>();
    resources.add(DemoController.class);
    return resources;
  }
}
