package cc.chengheng.DJsonGenerator_JsonParser;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

import java.io.File;
import java.io.IOException;

public class JsonGeneratorMain {
    public static void main(String[] args) throws IOException {
        // 实例化 JsonFactory 和 JsonParser 对象
        JsonFactory jsonFactory = new JsonFactory();
        JsonGenerator generator = jsonFactory.createGenerator(new File("perole.json"), JsonEncoding.UTF8);

        // 生成json
        generator.writeStartObject();
        generator.writeStringField("firstname", "feng");
        generator.writeStringField("lastname", "liulin");
        generator.writeNumberField("age", 30);
        generator.writeEndObject();
        generator.close();

        // result: {"firstname":"feng","lastname":"liulin","age":30}
    }
}
