package cc.chengheng.BJackson注解;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

public class Jackson注解 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        // 将对象转成json
        String json = objectMapper.writeValueAsString(newPerson());
        System.out.println(json);

        // 将json转成对象
        Person person = objectMapper.readValue(json, Person.class);
        System.out.println(person);
    }

    private static Person newPerson() {
        Address address = new Address();
        address.setState("河南");
        address.setCity("驻马店");
        address.setStreet("驿城区");

        Person fengliulin = new Person();
        fengliulin.setFirstname("feng");
        fengliulin.setLastname("liulin");
        fengliulin.setBirthday(new Date());
        fengliulin.setAddress(address);
        fengliulin.setJsonFiled("{\"country\":\"China\", \"city\": \"henan\"}");

        return fengliulin;
    }
}
