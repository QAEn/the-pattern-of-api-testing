package api.testing.service.endpoint;

import api.testing.service.RestService;
import api.testing.pojo.responsefrommock.Response;

import static io.restassured.RestAssured.given;

public class GetList extends RestService {

    public Response getResponse() {
        return given().spec(REQUEST_SPECIFICATION).get().body().as(Response.class);
    }

    @Override
    protected String setBasePath() {
        return BASE_PATH;
    }

    @Override
    protected String setParameterValue() {
        return FILE_AS_ENDPOINT;
    }
}