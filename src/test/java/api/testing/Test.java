package api.testing;

import api.testing.core.CoreTest;
import api.testing.service.endpoint.GetList;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static io.restassured.RestAssured.given;
import static java.lang.String.valueOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test extends CoreTest {

//    mvn clean test -P api-test

//    @ParameterizedTest(name = "{index} -> run test with values = {0}, {1}, {2}")
//    @CsvFileSource(resources = "/testdata/dataForTest.csv", numLinesToSkip = 1, delimiter = ',')
//    @DisplayName("poc test with data provider")
//    public void pocTestWithDataProvider(String expectedId, String expectedTasks, String expectedPriority) {
//        assertAll(
//                () -> assertEquals(expectedId, api.getListEndpoint.getResponse()
//                        .getCopyright()),
//                () -> assertEquals(expectedTasks, api.getListEndpoint.getResponse()
//                        .getNumResults()),
//                () -> assertEquals(expectedPriority, api.getListEndpoint.getResponse()
//                        .getStatus())
//        );
//    }

    @ParameterizedTest(name = "{index} -> completeEndpoint = {0}")
    @ValueSource(strings = {"Copyright (c) 2016 The New York Times Company.  All Rights Reserved."})
    @DisplayName("completeEndpoint test with one expected result")
    void checkCompleteEndpointWorkerId(String expectedStatus) {
        System.err.println("start");
        assertThat(api.getListEndpoint.getResponse()
                .getCopyright()).asString().contains(expectedStatus);
        System.err.println("end");
    }

//    @ParameterizedTest(name = "{index} -> completeEndpoint = {0}")
//    @CsvFileSource(resources = "/testdata/dataForComplete.csv")
//    @DisplayName("test data from file")
//    void checkCompleteEndpointFromFile(String expectedId) {
//        assertThat(api.getListEndpoint.getResponse()
//                .getBody()).extracting(Body::getId).asString().contains(expectedId);
//    }

//    @Test
//    @DisplayName("check url")
//    void checkUrl() {
//        String responseUrl = valueOf(api.getListEndpoint.getResponse().getStatus());
//        System.err.println("-->> " + responseUrl + " <<--");
//    }
}