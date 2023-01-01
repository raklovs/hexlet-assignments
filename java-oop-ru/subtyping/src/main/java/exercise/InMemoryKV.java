package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage{

    private Map<String, String> data = new HashMap<>();

    public InMemoryKV(Map<String, String> initial) {
        data.putAll(initial);
    }

    @Override
    // Добавляет в словарь новое значение по указанному ключу (или меняет значение, если ключ уже существует).
    public void set(String key, String value) {
        data.put(key, value);
    }

    @Override
    // Удаляет из словаря значение по переданному ключу.
    public void unset(String key) {
        data.remove(key);
    }

    @Override
    // Возвращает значение по указанному ключу. Если такого ключа в словаре нет, возвращает значение по умолчанию.
    public String get(String key, String defaultValue) {
        return data.getOrDefault(key, defaultValue);
    }

    @Override
    // Возвращает базу данных в виде словаря Map.
    public Map<String, String> toMap() {
        return new HashMap<>(data);
    }
}
// END
