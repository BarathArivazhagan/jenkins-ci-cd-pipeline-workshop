package com.barath.app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testHome() throws UnsupportedEncodingException, Exception {
		String response=mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		System.out.println("Response is "+response);
		assertEquals(response, "hello demo");
	}

}
