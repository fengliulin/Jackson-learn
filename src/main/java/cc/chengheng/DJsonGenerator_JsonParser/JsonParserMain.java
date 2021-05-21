package cc.chengheng.DJsonGenerator_JsonParser;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.File;
import java.io.IOException;

class JsonParserMain {
    public static void main(String[] args) throws IOException {
        String json = "{\"firstname\":\"feng\",\"lastname\":\"liulin\",\"age\":30}";

        // 实例化 JsonFactory 和 JsonParser 对象
        JsonFactory jsonFactory = new JsonFactory();
        JsonParser parser = jsonFactory.createParser(json);

        // 解析json
        while (!parser.isClosed()) {
            JsonToken jsonToken = parser.nextToken();

            if (JsonToken.FIELD_NAME.equals(jsonToken)) {
                String fileName = parser.getCurrentName();
                jsonToken = parser.nextToken();
                System.out.println(fileName + ":" + parser.getValueAsString());
            }
        }

        // result:
//        firstname:feng
//        lastname:liulin
//        age:30
    }
}
