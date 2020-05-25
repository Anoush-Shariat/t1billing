package com.t1billing.cuenta;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CuentaApplication {

    public static void main(String[] args) {

        //ApplicationContext context = SpringApplication.run(CuentaApplication.class, args);
        ApplicationContext context;
        context = new SpringApplicationBuilder(CuentaApplication.class)
                .properties("profile=dev")
                .properties("server.port=7070")
                .run(args);

    }

}
