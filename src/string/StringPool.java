package string;

import java.util.HashMap;
import java.util.Map;

public class StringPool {
    private final Map<String, String> pool;

    public StringPool() {
        this.pool = new HashMap<>();
    }

    public String addString(String str) {
        return pool.computeIfAbsent(str, k -> str);
    }

    public String getString(String str) {
        return pool.get(str);
    }

    public void printPool() {
        System.out.println("String Pool:");
        for (Map.Entry<String, String> entry : pool.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
