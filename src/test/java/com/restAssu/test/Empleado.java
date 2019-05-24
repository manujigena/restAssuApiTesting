/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restAssu.test;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

/**
 *
 * @author Manula
 */
public class Empleado {
    
    @Test
    public void validateEmployee(){
        given().
        header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJkYXRhIjp7ImlkRW1wbGVhZG8iOjEwMDAwLCJub21icmUiOiJHYWJyaWVsYSIsImFwZWxsaWRvIjoiR29tZXoiLCJpZFRpcG8iOjEsImlkRXN0YWRvIjoxfSwiYXBwIjoiVG9rZW4gQ29tYW5kYSJ9.WRtx9TJ8dSiebvcVzF8KHzkGG3YmxpqjrO3Vxuzn9w8").
        get("https://apicomanda.000webhostapp.com/empleado/").then().statusCode(200).log().all();
    }
}
