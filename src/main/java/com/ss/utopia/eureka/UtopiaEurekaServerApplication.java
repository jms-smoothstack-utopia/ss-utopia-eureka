package com.ss.utopia.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UtopiaEurekaServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(UtopiaEurekaServerApplication.class, args);
  }

}
