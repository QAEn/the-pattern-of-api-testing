package api.testing.service;

import api.testing.util.GetProperty;
import io.restassured.http.ContentType;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static api.testing.util.GetProperty.NameOfProperty.URL;
import static api.testing.util.GetProperty.NameOfProperty.MOCK;

public abstract class RestService {

    protected RequestSpecification REQUEST_SPECIFICATION;

    protected GetProperty getProperty = new GetProperty(URL);
    protected GetProperty getMethods = new GetProperty(MOCK);

    protected String BASE_URL = getProperty.getResource("base_url");
    protected String BASE_PATH = getProperty.getResource("base_path");
    protected String FILE_AS_ENDPOINT = getMethods.getResource("json_file_as_endpoint");
    private String PARAMETER_NAME = getProperty.getResource("parameter_name");

    public RestService() {
        this.REQUEST_SPECIFICATION = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setBasePath(setBasePath())
                .addParam(PARAMETER_NAME, setParameterValue())
                .setContentType(ContentType.JSON)
                .build();
    }

    protected abstract String setBasePath();
    protected abstract String setParameterValue();
}