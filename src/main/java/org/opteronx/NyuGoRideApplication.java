package org.opteronx;

import com.hubspot.dropwizard.guice.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class NyuGoRideApplication extends Application<NyuGoRideConfiguration> {

    @Override
    public void initialize(Bootstrap<NyuGoRideConfiguration> bootstrap) {
        GuiceBundle<NyuGoRideConfiguration> guiceBundle = GuiceBundle.<NyuGoRideConfiguration>newBuilder()
//                .addModule(new ServerModule())
                .setConfigClass(NyuGoRideConfiguration.class)
                .enableAutoConfig(getClass().getPackage().getName())
                .build();
        bootstrap.addBundle(guiceBundle);
    }

    public static void main(String[] args) throws Exception {
        new NyuGoRideApplication().run(args);
    }

    @Override
    public void run(NyuGoRideConfiguration configuration, Environment environment) throws Exception {

    }
}