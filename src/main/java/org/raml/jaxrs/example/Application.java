package org.raml.jaxrs.example;

/**
 * Created by gabrieldimech on 23/08/2016.
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

//    @Bean
//    public static PurchaseResourceImpl PurchaseResourceImpl() {
//        return new PurchaseResourceImpl();
//    }
    public static void main(String[] args) {
        new Application()
                .configure(new SpringApplicationBuilder(Application.class))
                .run(args);

    }


}