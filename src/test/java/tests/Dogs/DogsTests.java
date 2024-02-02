package tests.Dogs;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.create_success_status_code;
import static Common.CommonTestData.success_status_code;
import static Common.RequestBuilder.createEmployeeResponse;
import static Common.RequestBuilder.getBreedsListResponse;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.containsStringIgnoringCase;

@Test
@Feature("Dogs")
@Story("get list of dog breeds")
public class DogsTests {

    @Description("As an api user, i want to get a list of all dog breeds")
    @Severity(SeverityLevel.CRITICAL)
    public void getListOfDogBreedsTests() {
        getBreedsListResponse().
                then().
                assertThat().
                statusCode(success_status_code).
                body(containsString("appenzeller"));
    }
}



