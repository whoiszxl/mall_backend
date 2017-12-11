package com.whoiszxl.spring.web.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.whoiszxl.BookShopAdminApplication;

/**
 * @author zxlvoid
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookShopAdminApplication.class)
public class BookControllerTest {
	
	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc; //模拟请求
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void whenBookQuerySuccess() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/book")//发送get请求到/book中
				.param("keyword", "chenhuixian")//带参数
				.param("pageSize", "100")
				.accept(MediaType.APPLICATION_JSON_UTF8))//类型
				.andExpect(MockMvcResultMatchers.status().isOk())//返回状态必须为200
				.andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(3));//返回的长度要为3
	}
	
	@Test
	public void whenGetInfoSuccess() throws Exception {
		String result = mockMvc.perform(MockMvcRequestBuilders.get("/book/1")
								.accept(MediaType.APPLICATION_JSON_UTF8))
								.andExpect(status().isOk())
								.andExpect(jsonPath("$.name").value("绿毛水怪"))
								.andReturn().getResponse().getContentAsString();
		System.out.println(result);
	}

}
