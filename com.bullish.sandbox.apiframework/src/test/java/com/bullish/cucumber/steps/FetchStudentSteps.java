package com.bullish.cucumber.steps;

import com.bullish.pojos.FetchStudentResponse;
import com.bullish.utility.PropertiesReader;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;

public class FetchStudentSteps {

    Response response;
    FetchStudentResponse fetchStudentResponse;

    @Before
    public void setUp() {
        RestAssured.baseURI = PropertiesReader.getPropertiesValue("baseUrl");
    }

    @Given("the student record is retrieved")
    public void the_student_record_is_retrieved() throws Throwable {
        RequestSpecification requestSpec = RestAssured.given();

        response = requestSpec.get("/studentmgmt/fetchStudents");
        response.prettyPrint();

    }

    @Then("^the status code (\\d+) is returned$")
    public void the_status_code_is_returned(int statusCode) throws Throwable {

        MatcherAssert.assertThat(response.getStatusCode(), Matchers.is(statusCode));

    }

    @Then("^verify the following fields exist$")
    public void verify_the_following_fields_exist(List<String> responseString) throws Throwable {
        List<String> fieldNames = responseString;
        System.out.println(Arrays.toString(fieldNames.toArray()));
        System.out.println(response.jsonPath().toString());
        for (String s: responseString){
            Assert.assertTrue(response.body().asString().contains(s));
        }

    }

}






