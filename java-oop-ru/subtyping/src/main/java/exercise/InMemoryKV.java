package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage{

    Map<String, String> initial;

    public InMemoryKV(Map<String, String> initial) {
        this.initial = initial;
    }

    @Override
    // Добавляет в словарь новое значение по указанному ключу (или меняет значение, если ключ уже существует).
    public void set(String key, String value) {
        if (initial.containsKey(key)) {
            var val = initial.get(key);
            unset(key);
            initial.put(key, val);
        }
        initial.put(key, value);
    }

    @Override
    // Удаляет из словаря значение по переданному ключу.
    public void unset(String key) {
        initial.remove(key);
    }

    @Override
    // Возвращает значение по указанному ключу. Если такого ключа в словаре нет, возвращает значение по умолчанию.
    public String get(String key, String defaultValue) {
        if (!initial.containsKey(key)) {
            return defaultValue;
        }
        return initial.get(key);
    }

    @Override
    // Возвращает базу данных в виде словаря Map.
    public Map<String, String> toMap() {
        return initial;
    }

    public static void main(String[] args) {
        Map<String, String> initial = new HashMap<>();
        initial.put("key", "value");
        initial.put("key2", "value2");
        var val = initial.get("key");
        initial.remove("key");
        initial.put("key", val);
        System.out.println(initial);
    }
}
// END
