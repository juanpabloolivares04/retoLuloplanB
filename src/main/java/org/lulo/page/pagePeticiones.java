package org.lulo.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Before;

public class pageGetAll extends PageObject {

    private static final String url = "http://dummy.restapiexample.com/api/v1";
    private static final String ENDPOINTALL = "/employees";

    public void configGetAllUsers() {


    }
    public void getAllUsers() {

        SerenityRest.given().baseUri(url + ENDPOINTALL).header("Retry-After", "30").get();
    }

   public void statusgetAllUsers(int status){
    SerenityRest.lastResponse().then().log().all().statusCode(status);
    }



}
