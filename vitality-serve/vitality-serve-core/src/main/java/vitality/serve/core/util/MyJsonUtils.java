package vitality.serve.core.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import vitality.serve.core.exception.MyException;

import java.util.List;

/**
 * @author huanghz
 */
public class MyJsonUtils {
    private static final ObjectMapper OBJECT_MAPPER;

    static {
        OBJECT_MAPPER = new ObjectMapper();
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String objectToString(Object obj) {
        try {
            return OBJECT_MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw MyException.newInstance(e);
        }
    }

    public static <T> T stringToObject(String str, TypeReference<T> type) {
        try {
            return OBJECT_MAPPER.readValue(str, type);
        } catch (JsonProcessingException e) {
            throw MyException.newInstance(e);
        }
    }

    public static <T> T stringToObject(String str, Class<T> clazz) {
        try {
            return OBJECT_MAPPER.readValue(str, clazz);
        } catch (JsonProcessingException e) {
            throw MyException.newInstance(e);
        }
    }

    public static <T> List<T> stringToList(String str, Class<T> cls) {
        try {
            return OBJECT_MAPPER.readValue(str, OBJECT_MAPPER.getTypeFactory().constructParametricType(List.class, cls));
        } catch (JsonProcessingException e) {
            throw MyException.newInstance(e);
        }
    }
}
