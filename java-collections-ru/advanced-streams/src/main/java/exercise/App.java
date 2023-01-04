package exercise;

import java.util.Arrays;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static String getForwardedVariables(String content) {
        String[] result = content.split("\n");
        return Arrays.stream(result)
                .filter(environment -> environment.startsWith("environment="))
                .map(environment -> environment.replaceAll("environment=", "")
                        .replaceAll("\"", ""))
                .flatMap(forvarded -> Arrays.stream(forvarded.split(","))
                        .filter(a -> a.contains("X_FORWARDED_")))
                .map(forvarded -> forvarded.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
