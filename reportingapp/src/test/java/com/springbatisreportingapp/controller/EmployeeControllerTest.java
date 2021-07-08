package com.springbatisreportingapp.controller;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class EmployeeControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().string(containsString("<p>getEmployee query <a href=\"/Employee\">here</a></p>")))
				.andExpect(content().string(containsString("<p>getEmployeeById query <a href=\"/Employee?id=1\">here</a></p>")));
	}

	@Test
	public void getEmployeeById() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/Employee?id=1").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello, John!")));
	}
}
