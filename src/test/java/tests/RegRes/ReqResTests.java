package tests.RegRes;

import Common.RequestBuilder;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import static Common.CommonTestData.create_success_status_code;
import static Common.RequestBuilder.createEmployeeResponse;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.containsStringIgnoringCase;

@Test
@Feature("Req Res")
@Story("create employee")

public class ReqResTests {

    @Description("As an api user, i want to create a new employee")
    @Severity(SeverityLevel.CRITICAL)
    public void createEmployeeTests() {
        createEmployeeResponse().
                then().
                assertThat().
                statusCode(create_success_status_code).
                body("name", containsString("Brandon")).
                body("job", containsStringIgnoringCase("SoA"));
    }
}
