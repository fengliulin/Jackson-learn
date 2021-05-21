package cc.chengheng.BJackson注解.JsonAnySetter_JsonAnyGetter;

import cc.chengheng.BJackson注解.Address;
import com.fasterxml.jackson.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Person {

    private Map<String, Object> properties = new HashMap<>();


    @JsonAnySetter
    public void set(String fieldName, Object val) {
        this.properties.put(fieldName, val);
    }

    @JsonAnyGetter
    public Object get(String fieldName) {
        return this.properties.get(fieldName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "properties=" + properties +
                '}';
    }
}
