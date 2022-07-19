package api.testing.mock;

import lombok.experimental.UtilityClass;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

@UtilityClass
public class MockFileReaderUtil {

    public static String readFile(String name) throws IOException {
        Path fileName = Path.of("src/main/resources/responsefrommock/" + name);
        return Files.readString(fileName);
    }
}