package com.example.ultra.execution;

import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@ScenarioScope
@Component
public class ScenarioContext {
    private final HashMap<Key, Object> DATA = new HashMap<>();

    public <T> T save(Key key, T value) {
        if (key == null) throw new IllegalArgumentException("Key must not be null");
        DATA.put(key, value);
        return value;
    }

    public <T> T get(Key key, Class<T> clazz) {
        if (key == null) throw new IllegalArgumentException("Key must not be null");
        return clazz.cast(DATA.get(key));
    }
}
