package cc.chengheng.BJackson注解.自定义输出的类型JsonSerialize序列化和JsonDeserialize反序列化;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class BooleanToIntSerialize extends JsonSerializer<Boolean> {
    @Override
    public void serialize(Boolean value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value) {
            gen.writeNumber(1);
        } else {
            gen.writeNumber(0);
        }
    }
}
