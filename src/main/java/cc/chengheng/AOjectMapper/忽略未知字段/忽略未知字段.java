package cc.chengheng.AOjectMapper.忽略未知字段;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 通常JSON和java类的字段必须相对应，否则解析JSON会报错
 * 我们可以通过配置使用它不报错
 */
public class 忽略未知字段 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        // 忽略位置字段, 就不报错了，否则 Unrecognized field "birthday"
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        String json = "{\"firstname\": \"feng\", \"lastname\": \"liulin\", \"birthday\": \"2018-05-25\"}";

        Person people = objectMapper.readValue(json, Person.class);
        System.out.println(people);
    }
}
