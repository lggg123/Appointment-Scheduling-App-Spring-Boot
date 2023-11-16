package test.java.codezforlife.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvsResultMatchers;

import org.junit.jupiter.api.Test;

// @WebMvcTest(HelloController.class): This annotation is 
// used for Spring MVC tests. It auto-configures MockMvc,
// which is essential for testing controllers. It focuses 
// only on the HelloController without starting a full HTTP server.
// @Autowired private MockMvc mockMvc;: MockMvc is injected into the 
// test. It's a powerful tool for testing MVC controllers without starting 
// a full HTTP server.
// mockMvc.perform(MockMvcRequestBuilders.get("/hello")): This line performs
// a mock HTTP GET request to the /hello endpoint.
// andExpect(...): These methods are used to assert the response status and content. In this case, we expect an HTTP 200 (OK) response and a response body containing the string "Hello World".
// @WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(MockMvsRequestBuilders.get("/hello"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("Hello World"));
    }
}