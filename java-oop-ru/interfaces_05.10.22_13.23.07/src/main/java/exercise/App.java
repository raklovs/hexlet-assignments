package exercise;

import java.util.List;

// BEGIN
public class App {

    public static List<String> buildAppartmentsList(List<Home> appartments, int n) {
        return appartments.stream()
                .sorted(Home::compareTo)
                .limit(n)
                .map(Home::toString)
                .toList();
    }
}
// END
