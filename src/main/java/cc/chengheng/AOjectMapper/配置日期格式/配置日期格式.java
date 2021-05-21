package cc.chengheng.AOjectMapper.配置日期格式;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 * 默认：Jackson会将日期转成long值
 * 我们也可以设置日期格式，将日期转为字符串
 */
public class 配置日期格式 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        // 设置日期格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        objectMapper.setDateFormat(dateFormat); // result: {"firstname":"feng","lastname":"liulin","birthday":"2021-05-21"}

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
        fengliulin.setBirthday(new Date());

        return fengliulin;
    }
}
