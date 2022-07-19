package api.testing.util;

import java.util.ResourceBundle;

public class GetProperty {

    private ResourceBundle myBundle;

    public enum NameOfProperty {
        URL,
        MOCK
    }

    public GetProperty(NameOfProperty nameOfProperty) {
        switch (nameOfProperty) {
            case URL:
                myBundle = ResourceBundle.getBundle("property/mock");
                break;
            case MOCK:
                myBundle = ResourceBundle.getBundle("property/endpoint");
                break;
            default:
                System.err.println("\n>The resource isn't selected. Check GetProperties.class<\n"); //todo change to correct log
                break;
        }
    }

    public String getResource(String resourceName) {
        return myBundle.getString(resourceName);
    }
}