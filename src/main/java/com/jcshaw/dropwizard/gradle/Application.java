package com.jcshaw.dropwizard.gradle;

import com.jcshaw.dropwizard.gradle.resource.ApplicationResource;
import io.dropwizard.setup.Environment;

public class Application extends io.dropwizard.Application<ApplicationConfiguration> {

    public static void main(String[] args) throws Exception {
        new Application().run(args);
    }

    @Override
    public void run(ApplicationConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new ApplicationResource());
    }
}
