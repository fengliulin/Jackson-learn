package cc.chengheng.AOjectMapper.读取json到普通Array_ArrayList_Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json数组格式到对象数组 {
    public static void main(String[] args) throws JsonProcessingException {
        // 实例华ObjectMapper对象
        ObjectMapper objectMapper = new ObjectMapper();

        // json 数组包含2个对象
        String json = "[{\"firstname\": \"feng\", \"lastname\": \"liulin\"}," +
                "{\"firstname\": \"feng1\", \"lastname\": \"liulin1\"}]";

        Person[] people = objectMapper.readValue(json, Person[].class);
        for (Person person : people) {
            System.out.println(person);
        }
        // result：
//        Person{firstname='feng', lastname='liulin'}
//        Person{firstname='feng1', lastname='liulin1'}
    }
}
