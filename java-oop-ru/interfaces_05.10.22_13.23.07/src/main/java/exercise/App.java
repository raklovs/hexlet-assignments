package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static List<String> buildAppartmentsList(List<Home> appartments, int n){

        List<String> result = new ArrayList<>();
        appartments.sort(Home::compareTo);
        if (n <= appartments.size()) {
            for (int i = 0; i < n; i++) {
                result.add(String.valueOf(appartments.get(i)));
            }
            return result;
        }
        else return new ArrayList<>();
    }
}
// END
