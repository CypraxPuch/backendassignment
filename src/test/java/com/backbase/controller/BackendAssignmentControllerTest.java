package com.backbase.controller;

import com.backbase.data.to.TransactionTo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context-backbase-it.xml")
public class BackendAssignmentControllerTest {

    @Autowired
    private BackendAssignmentController backendAssignmentControllerTest;

    @Test
    public void shouldReturnNotNullStringFromTransactions() {
        List<TransactionTo> transactions = backendAssignmentControllerTest.getTransactions();
        assertNotNull(transactions);
        assertTrue(transactions.size()>0);
    }

    @Test
    public void shouldReturnNotNullStringFromTxnByType() {
        String result = backendAssignmentControllerTest.getTransactionByType("dummyType");
        assertNotNull(result);
    }

    @Test
    public void shouldReturnNotNullStringFromAmountByTxnType() {
        String result = backendAssignmentControllerTest.getTotalAmountByTxnType("dummyType");
        assertNotNull(result);
    }
}
