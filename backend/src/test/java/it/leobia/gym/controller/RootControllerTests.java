package it.leobia.gym.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.util.Assert;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.util.Assert.isTrue;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class RootControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void itShouldForward() throws Exception {


        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders
                .get("/safdsa"))
                .andExpect(status().is2xxSuccessful())
                .andReturn();
        isTrue("/".equals(mvcResult.getResponse().getForwardedUrl()), "itShouldForward");


    }

}
