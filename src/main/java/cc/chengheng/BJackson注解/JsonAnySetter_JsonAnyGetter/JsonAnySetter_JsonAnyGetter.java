package cc.chengheng.BJackson注解.JsonAnySetter_JsonAnyGetter;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

public class JsonAnySetter_JsonAnyGetter {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        String json = "{\"firstname\": \"feng\", \"lastname\": \"liulin\"}";

        // 将json转成对象
        Person person = objectMapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
