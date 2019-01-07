package com.example.zcpro.mainservice;

import com.example.zcpro.mainservice.controller.Hello_boot;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static com.sun.javafx.fxml.expression.Expression.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainserviceApplicationTests.class)
public class MainserviceApplicationTests {
	private MockMvc mockMvc;
	@Before // 这个方法在每个方法执行之前都会执行一遍
	public void setUp() throws Exception     {
		// 初始化MockMvc对象            m
		mockMvc = MockMvcBuilders.standaloneSetup(new Hello_boot()).build();    }
		@Test
		public void getHello() throws Exception     {
		MvcResult rest = mockMvc.perform(MockMvcRequestBuilders.get("/test/testUnit")
				.accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status = rest.getResponse().getStatus();
		String content = rest.getResponse().getContentAsString();
		System.out.println(status +"--"+content);
	}
}

