package com.backbase.controller;

import com.backbase.data.entity.TotalAmountByTxnType;
import com.backbase.data.to.TransactionTo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context-backbase-it.xml")
public class BackendAssignmentControllerIntegrationTest {
    @Autowired
    private BackendAssignmentController backendAssignmentControllerTest;

    @Test
    public void shouldReturnNotNullStringFromTransactions() {
        String bankId = "rbs";
        String accountId = "savings-kids-john";
        String viewId = "public";

        List<TransactionTo> transactions = backendAssignmentControllerTest.getTransactions(bankId, accountId, viewId);
        assertNotNull(transactions);
        assertTrue(transactions.size() > 0);
        assertTrue(transactions.stream()
                .allMatch(t -> t.getAccountId().equalsIgnoreCase(accountId)));
    }

    @Test
    public void shouldReturnNotNullStringFromTxnByType() {
        String txnType = "SANDBOX_TAN";
        String bankId = "rbs";
        String accountId = "savings-kids-john";
        String viewId = "public";

        List<TransactionTo> transactions = backendAssignmentControllerTest.getTransactionByType(txnType, bankId, accountId, viewId);
        assertNotNull(transactions);
        assertTrue(transactions.size() > 0);
        assertTrue(transactions.stream()
                .allMatch(t -> t.getTransactionType().equalsIgnoreCase(txnType)));
    }

    @Test
    public void shouldReturnNotNullStringFromAmountByTxnType() {
        String txnType = "SANDBOX_TAN";
        String bankId = "rbs";
        String accountId = "savings-kids-john";
        String viewId = "public";

        TotalAmountByTxnType totalAmountByTxnType = backendAssignmentControllerTest.getTotalAmountByTxnType(txnType, bankId, accountId, viewId);
        assertNotNull(totalAmountByTxnType);
        assertEquals(txnType, totalAmountByTxnType.getTransactionType());
    }
}
