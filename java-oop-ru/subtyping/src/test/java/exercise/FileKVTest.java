package exercise;

// BEGIN
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

// END

class FileKVTest {

    // BEGIN
    @Test
    void fileKVTest() {
        KeyValueStorage storage = new FileKV("src/test/resources/file", Map.of("key", "value"));
        assertThat(storage.get("key2", "default")).isEqualTo("default");
        assertThat(storage.get("key", "default")).isEqualTo("value");

        storage.set("key3", "value3");
        storage.set("key", "10");
        assertThat(storage.get("key3", "default")).isEqualTo("value3");
        assertThat(storage.get("key", "default")).isEqualTo("10");

        storage.unset("key");
        assertThat(storage.get("key", "def")).isEqualTo("def");

        assertThat(storage.toMap()).isEqualTo(Map.of("key3", "value3"));
    }
    // END
}
