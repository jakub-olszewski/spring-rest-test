package eu.b24u.demo.rest.controllers;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ProductControllerTest {

    String PORT = "8080";
    String BASE_PATH = "http://localhost";
    private Map<String, Object> params;

    @Before
    public void setUp() throws Exception {
        RestAssured.port = Integer.valueOf(PORT);
        RestAssured.baseURI = BASE_PATH;
        params = new LinkedHashMap<String, Object>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setProductService() {
    }



    @Test
    public void getProduct() {

        //@formatter:off
        RestAssured.
                given().//log().all().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                params(params).
                header("Accept-Language", "pl").
                //expect().log().all().
                        when().
                get("/product/get/1").
                then().statusCode(HttpStatus.OK.value()).
                log().all(true);
        //@formatter:on
    }

    @Test
    public void postProduct() {

        JSONObject requestParams = new JSONObject();
        //requestParams.put("id", "200"); // Cast
        requestParams.put("version", "0");
        requestParams.put("productId", "138192983");
        requestParams.put("name", "eBook");
        requestParams.put("price", "12.99");

        //@formatter:off
        RestAssured.
                given().//log().all().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                params(params).
                header("Accept-Language", "pl").
                body(requestParams.toString()).
                //expect().log().all().
                        when().
                post("/product/post").
                then().statusCode(HttpStatus.OK.value()).
                        log().all(true);
        //@formatter:on
    }

    @Test
    public void edit() {
    }

    @Test
    public void newProduct() {
    }

    @Test
    public void saveProduct() {
    }

    @Test
    public void delete() {
    }
}