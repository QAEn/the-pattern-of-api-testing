package api.testing.mock;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Slf4j
@RestController
public class MockController {

    // http://localhost:8084/mock?fileName=GET_lists-names-format.json
    // https://www.baeldung.com/spring-request-param
    // https://any-api.com/nytimes_com/books_api/docs/_lists_names_format_/GET_lists_names_format

    @GetMapping(value = "/mock",  produces = "application/json")
    public ResponseEntity<String> getMockJson(@RequestParam final String fileName) {
        try {
            return ResponseEntity.ok(MockFileReaderUtil.readFile(fileName));
        } catch (IOException e) {
            log.error(e.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }
}