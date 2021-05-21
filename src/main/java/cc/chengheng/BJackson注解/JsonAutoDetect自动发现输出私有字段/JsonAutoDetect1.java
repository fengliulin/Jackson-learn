package cc.chengheng.BJackson注解.JsonAutoDetect自动发现输出私有字段;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAutoDetect1 {
    public static void main(String[] args) throws JsonProcessingException {
        // 实力话ObjectMapper对象
        ObjectMapper objectMapper = new ObjectMapper();

        // 将对象转成json
        String json = objectMapper.writeValueAsString(newPerson());
        System.out.println(json);
    }

    private static Person newPerson() {
        Person person = new Person();
        person.setFirstname("feng");
        person.setLastname("liulin");

        return person;
    }
}
