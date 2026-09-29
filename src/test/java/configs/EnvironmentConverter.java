package configs;

import org.aeonbits.owner.Converter;
import constants.Environment;

import java.lang.reflect.Method;

public class EnvironmentConverter implements Converter<Enum<Environment>> {

    @Override
    public Enum<Environment> convert(Method method, String input) {
        return Environment.valueOf(input.toUpperCase());
    }
}
