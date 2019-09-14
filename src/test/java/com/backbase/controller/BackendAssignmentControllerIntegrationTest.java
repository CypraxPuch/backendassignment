package com.backbase.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context-backbase-it.xml")
public class BackendAssignmentControllerIntegrationTest {

    private static final String URL_TXN_LIST = "/transaction/list";
    private static final String URL_TXN_TYPE = "/transaction/type/";
    private static final String URL_TXN_TYPE_AMOUNT = "/transaction/amount/";

    @Autowired
    private BackendAssignmentController backendAssignmentControllerTest;

    private MockMvc mockMvc;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(BackendAssignmentControllerIntegrationTest.class);
        mockMvc = MockMvcBuilders.standaloneSetup(backendAssignmentControllerTest).build();
    }

    @Test
    public void testList() throws Exception {
        /*mockMvc.perform(get(URI.create(URL_TXN_LIST)))
                .andExpect(status().isOk());*/
    }
}
