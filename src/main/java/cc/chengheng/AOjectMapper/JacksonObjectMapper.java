package cc.chengheng.AOjectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JacksonObjectMapper {
    public static void main(String[] args) throws IOException {
        // 实力话ObjectMapper对象
        ObjectMapper objectMapper = new ObjectMapper();

        // 将对象转成json
        String json = objectMapper.writeValueAsString(newPerson());
        System.out.println(json);

        // 将json转成对象
        Person person = objectMapper.readValue(new File(Objects.requireNonNull(JacksonObjectMapper.class.getClassLoader().getResource("cat.json")).getPath()), Person.class);
        System.out.println(person);
    }

    private static Person newPerson() {
        List<PhoneNumber> phones = new ArrayList<>();

        PhoneNumber phone = new PhoneNumber();
        phone.setCode("86");
        phone.setCode("0411-12345678");
        phones.add(phone);

        PhoneNumber cell = new PhoneNumber();
        cell.setCode("86");
        cell.setNumber("18109360113");
        phones.add(cell);

        Address address = new Address();
        address.setState("河南");
        address.setCity("驻马店");
        address.setStreet("驿城区");

        Person fengliulin = new Person();
        fengliulin.setFirstname("feng");
        fengliulin.setLastname("liulin");
        fengliulin.setAddress(address);
        fengliulin.setPhones(phones);

        return fengliulin;
    }
}


