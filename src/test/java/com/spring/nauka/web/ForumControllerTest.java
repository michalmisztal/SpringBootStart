package com.spring.nauka.web;

import com.spring.nauka.Main;
import com.spring.nauka.service.ForumService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Admin on 2017-02-08.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Main.class})
@WebAppConfiguration
public class ForumControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private ForumService forumService;

    @Resource
    private WebApplicationContext webApplicationContext;


    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void save() throws Exception {

    }

    @Test
    public void getForum() throws Exception {

        mockMvc.perform(get("/api/v2/{id}","58a5d78dc1eb2b13846b6bff"))
                .andExpect(status().isOk());
    }

}