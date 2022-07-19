package api.testing.core;

import api.testing.service.RestWrapper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class CoreTest {

    protected static RestWrapper api;

    @BeforeAll
    public static void prepareTests() {
        api = new RestWrapper();
        System.err.println("run");
    }

    @AfterAll
    public static void tearDownAll() {
        api = null;
        System.err.println("---The instance was tore down---"); //todo change to correct log
    }
}