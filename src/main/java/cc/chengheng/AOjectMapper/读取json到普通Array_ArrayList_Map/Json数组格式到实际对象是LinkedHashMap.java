package cc.chengheng.AOjectMapper.读取json到普通Array_ArrayList_Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

public class Json数组格式到实际对象是LinkedHashMap {
    public static void main(String[] args) throws JsonProcessingException {
        // 实例华ObjectMapper对象
        ObjectMapper objectMapper = new ObjectMapper();

        // json 数组包含2个对象
        String json = "{\"firstname\": \"feng\", \"lastname\": \"liulin\"}";

        // 实际对象是LinkedHashMap
        Map<String, Object> people = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {});
        System.out.println(people);
        // result：{firstname=feng, lastname=liulin}
    }
}
