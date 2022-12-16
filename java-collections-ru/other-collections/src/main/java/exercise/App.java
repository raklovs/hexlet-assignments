package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {

        Map<String, String> comparisonResult = new LinkedHashMap<>();
        for (Map.Entry<String, Object> elementsMapData1 : data1.entrySet()) {
            if (!data2.containsKey(elementsMapData1.getKey())) {
                comparisonResult.put(elementsMapData1.getKey(), "deleted");
            } else if (Objects.equals(elementsMapData1.getValue(), data2.get(elementsMapData1.getKey()))) {
                comparisonResult.put(elementsMapData1.getKey(), "unchanged");
            } else {
                comparisonResult.put(elementsMapData1.getKey(), "changed");
            }
        }
        for (Map.Entry<String, Object> elementsMapData2 : data2.entrySet()) {
            if (!data1.containsKey(elementsMapData2.getKey())) {
                comparisonResult.put(elementsMapData2.getKey(), "added");
            }
        }
        return comparisonResult;
    }
}
//END
