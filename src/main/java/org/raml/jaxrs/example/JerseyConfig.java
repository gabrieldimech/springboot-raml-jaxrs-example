package org.raml.jaxrs.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.raml.jaxrs.example.resource.PurchaseResourceImpl;
import org.springframework.stereotype.Component;

/**
 * Created by gabrieldimech on 23/08/2016.
 */

@Component
//@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(PurchaseResourceImpl.class);
    }
}