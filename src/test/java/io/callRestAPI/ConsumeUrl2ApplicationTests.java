package io.callRestAPI;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.test.web.servlet.MockMvc;

import io.callRestAPI.Model.Foo;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import org.springframework.security.test.context.support.WithMockUser;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ConsumeUrl2ApplicationTests {


	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testHomePage() throws Exception {
		/*
		 * this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
		 * .andExpect(content().string(containsString("Call Foo API")));
		 */
		
		this.mockMvc.perform(get("/")).andDo(print())
	       .andExpect(model().attributeExists("title"))
	       .andExpect(view().name("Home"));
	}
	
	
	@WithMockUser(value = "user")
	@Test
	public void testGetFooDetails() throws Exception {
		
		
		this.mockMvc.perform(get("/getFooDetails")).andDo(print())
	       .andExpect(model().attributeExists("foo"))
	       .andExpect(view().name("showFooDetails"));
		
		//ModelAndViewAssert
	}

	@Test
	public void testfooAPIcall() throws Exception {
		
		assertThat(this.restTemplate.getForObject("https://postman-echo.com/get?foo1=bar1&foo2=bar2",
				String.class)).contains("args");
		assertThat(this.restTemplate.getForObject("https://postman-echo.com/get?foo1=bar1&foo2=bar2",
				String.class)).contains("headers");
		assertThat(this.restTemplate.getForObject("https://postman-echo.com/get?foo1=bar1&foo2=bar2",
				String.class)).contains("url");
	}
	
	/*
	 * @Test void contextLoads() { }
	 */

}
