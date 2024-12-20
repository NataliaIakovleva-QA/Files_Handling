import com.fasterxml.jackson.databind.ObjectMapper;
import model.JsonFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;


public class JsonTest {
    private ClassLoader cl = JsonTest.class.getClassLoader();

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void checkJsonFileTest() throws Exception {
        try (InputStream is = cl.getResourceAsStream("JsonFile.json")) {
            assert is != null;
            try (InputStreamReader isr = new InputStreamReader(is)) {
                JsonFile data;
                data = objectMapper.readValue(isr, JsonFile.class);
                Assertions.assertEquals("Small", data.getSize());
                Assertions.assertEquals("Black", data.getColour());
                Assertions.assertEquals(2.5, data.getVolume());
                Assertions.assertEquals("Used", data.getCondition());
                Assertions.assertEquals(true, data.isClosed());
                Assertions.assertEquals(List.of("lipstick",
                        "phone",
                        "wallet"), data.getContents());


            }
        }
    }
}