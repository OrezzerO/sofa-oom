package com.orez.sofaoom;

import org.jboss.resteasy.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SofaOomApplication {

  public static void main(String[] args) {
    Logger.setLoggerType(Logger.LoggerType.SLF4J);
    SpringApplication.run(SofaOomApplication.class, args);
  }

}
