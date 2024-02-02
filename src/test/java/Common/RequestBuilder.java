package Common;

import io.restassured.response.Response;

import static Common.BasePaths.*;
import static Common.ContentTypes.*;
import static io.restassured.RestAssured.*;
import static Common.PayloadBuilder.*;

public class RequestBuilder {

    public static Response createEmployeeResponse() {
        return given().
                when().
                body(createEmployeeObject()).
                contentType(Json_Content_Type).
                log().
                all().
                post(ReqRes_BaseURL + "/api/users").
                then().
                log().
                all().
                extract().
                response();
    }

    public static Response getBreedsListResponse() {
        return given().
                when().
                contentType(Json_Content_Type).
                log().
                all().
                get(Dogs_BaseURL+"/breeds/list/all").
                then().
                log().
                all().
                extract().
                response();
    }


}
