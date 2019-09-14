package com.backbase.controller;

import com.backbase.data.to.TransactionTo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context-backbase-it.xml")
public class BackendAssignmentControllerIntegrationTest {

    //private static final String URL_TXN_LIST = "/list/{bankId}/{accountId}/{viewId}";
    private static final String URL_TXN_LIST = "/transaction/list/%1$s/%2$s/%3$s";
    //private static final String URL_TXN_TYPE = "/type/{txnType}/{bankId}/{accountId}/{viewId}";
    private static final String URL_TXN_TYPE = "/transaction/type/%1$s/%2$s/%3$s/%4$s";
    //private static final String URL_TXN_TYPE_AMOUNT = "/amount/{txnType}/{bankId}/{accountId}/{viewId}";
    private static final String URL_TXN_TYPE_AMOUNT = "/transaction/amount/%1$s/%2$s/%3$s/%4$s";

    @Mock
    private BackendAssignmentController backendAssignmentControllerTest;

    private MockMvc mockMvc;

    String uuid1 = UUID.randomUUID().toString();
    String uuid2 = UUID.randomUUID().toString();

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        List<TransactionTo> lst = new ArrayList<>();
        TransactionTo to1 = new TransactionTo();
        to1.setId(uuid1);
        TransactionTo to2 = new TransactionTo();
        to1.setId(uuid2);
        lst.add(to1);
        lst.add(to2);
        when(backendAssignmentControllerTest.getTransactions(anyString(),anyString(),anyString()))
                .thenReturn(lst);
        mockMvc = MockMvcBuilders.standaloneSetup(backendAssignmentControllerTest).build();
    }

    @Test
    public void testList() throws Exception {
        String bankId = "mockedBankId";
        String accountId = "mockedAccountId";
        String viewId = "mockedViewId";
        ResultActions resultActions = mockMvc.perform(get(URI.create(String.format(URL_TXN_LIST, bankId, accountId, viewId))))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2));

        verify(backendAssignmentControllerTest).getTransactions(bankId, accountId, viewId);
    }
}
