package com.springboot.test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.event.annotation.BeforeTestMethod;

import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.springframework.web.context.WebApplicationContext;

public class TestClientProject extends SpringBootTestApplication {

 @Autowired

 private WebApplicationContext webApplicationContext;

 private MockMvc mockMvc;

 @Before

 public void setup() {

 mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

 }

 @Test

 public void testEmployee() throws Exception {

 mockMvc.perform(get("/client")).andExpect(status().isOk())

 .andExpect(content().contentType("application/json"))

 .andExpect(jsonPath("$.name").value("sagarika")).andExpect(jsonPath("$.projectId").value("BM121"))

 .andExpect(jsonPath("$.project").value("Bank management"));

 }
}
