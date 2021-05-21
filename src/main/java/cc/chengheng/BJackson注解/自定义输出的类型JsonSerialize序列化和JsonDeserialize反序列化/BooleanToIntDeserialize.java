package cc.chengheng.BJackson注解.自定义输出的类型JsonSerialize序列化和JsonDeserialize反序列化;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class BooleanToIntDeserialize extends JsonDeserializer<Boolean> {
    @Override
    public Boolean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String val = p.getText();
        if ("0".equals(val)) {
            return false;
        }
        return true;
    }
}
