package cc.chengheng.BJackson注解.自定义输出的类型JsonSerialize序列化和JsonDeserialize反序列化;

import cc.chengheng.AOjectMapper.JacksonObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class 自定义序列化和反序列输出类型 {

    public static void main(String[] args) throws IOException {
        // 实力话ObjectMapper对象
        ObjectMapper objectMapper = new ObjectMapper();

        // 将对象转成json
        String json = objectMapper.writeValueAsString(newPerson());
        System.out.println(json);

        // 将json转成对象
        Person person = objectMapper.readValue(json, Person.class);
        System.out.println(person);
    }
    private static Person newPerson() {

        Person fengliulin = new Person();
        fengliulin.setFirstname("feng");
        fengliulin.setLastname("liulin");
        fengliulin.setIsMale(true);
        return fengliulin;
    }
}
