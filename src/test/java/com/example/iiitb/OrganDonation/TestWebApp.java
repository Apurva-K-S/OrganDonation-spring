package com.example.iiitb.OrganDonation;

import com.example.iiitb.OrganDonation.Beans.LoginDetails;
import com.example.iiitb.OrganDonation.Controller.LoginController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class TestWebApp extends OrganDonationApplicationTests {

    @Autowired
    private WebApplicationContext webApplicationContext;


    private MockMvc mockMvc;

    private LoginController loginController;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testEmployee() throws Exception {

        LoginDetails loginDetails = new LoginDetails();
        loginDetails.setLoginAs("Primary User");
        loginDetails.setLoginEmail("user1@gmail.com");
        loginDetails.setLoginPassword("12345");

        System.out.println(loginDetails.getLoginAs() + " --- " + loginDetails.getLoginEmail() + " ---- " + loginDetails.getLoginPassword());
        //mockMvc.perform(post("/login").contentType(MediaType.APPLICATION_JSON_VALUE).param(loginDetails.getLoginEmail(), loginDetails.getLoginPassword(), loginDetails.getLoginAs())).andExpect(status().isOk());
        //mockMvc.perform(post("/login").contentType(MediaType.APPLICATION_JSON_VALUE)).andDo(loginController.userAuthentication(loginDetails)).andExpect(status().isOk());

        /*  .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(jsonPath("$.name").value("emp1")).andExpect(jsonPath("$.designation").value("manager"))
                .andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(3000));*/

    }
}
