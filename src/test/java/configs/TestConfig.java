package configs;

import constants.Environment;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "classpath:propertiesFiles/preprod.properties"
})
public interface TestConfig extends Config {

    @Key("hostUrl")
    String hostUrl();

    @Key("environment")
    @ConverterClass(EnvironmentConverter.class)
    Environment environment();
}