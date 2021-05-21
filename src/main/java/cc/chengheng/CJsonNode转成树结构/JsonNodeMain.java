package cc.chengheng.CJsonNode转成树结构;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.Map;

public class JsonNodeMain {
    public static void main(String[] args) throws JsonProcessingException {
        // 实例华ObjectMapper对象
        ObjectMapper objectMapper = new ObjectMapper();

        // json 数组包含2个对象
        String json = "{\"firstname\": \"feng\", \"lastname\": \"liulin\", \"age\": 30}";

        // 将json转程JsonNode对象
        JsonNode rootNode = objectMapper.readTree(json);

        // 得到节点值
        JsonNode firstnameNode = rootNode.get("firstname");
        System.out.println("firstname:" + firstnameNode.asText());

        JsonNode ageNode = rootNode.get("age");
        System.out.println("age:" + ageNode.asInt());

        // 创建节点
        ObjectNode newNode = objectMapper.createObjectNode();
        newNode.setAll((ObjectNode) rootNode);
        newNode.put("city", "驻马店");

        // 将JsonNode 对象转成 json
        String newJson = objectMapper.writeValueAsString(newNode);
        System.out.println(newJson);
    }
}
