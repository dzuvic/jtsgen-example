package dz.jtsgen.example.server;

import javax.json.stream.JsonGenerator;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class TsGenExampleApplication extends ResourceConfig {

    public TsGenExampleApplication() {
        packages("dz.jtsgen.example.server.resource");
        register(LoggingFeature.class);
        register(ExampleObjectMapperProvider.class);
        property(JsonGenerator.PRETTY_PRINTING, true);
    }
}
