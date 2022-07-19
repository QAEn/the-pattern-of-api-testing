package api.testing.service;

import api.testing.service.endpoint.GetList;

public class RestWrapper {

    public GetList getListEndpoint;

    public RestWrapper() {
        getListEndpoint = new GetList();  //todo: fix creating redundant object if we don't use one EP, but use another
    }
}