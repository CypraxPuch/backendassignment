package com.backbase.data.entity;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 2:23 PM<br/>
 * Generated to
 */
public class TransactionResponseTest {

    private TransactionResponse transactionResponse;

    @Before
    public void setUp() throws Exception {
        transactionResponse = new TransactionResponse();
    }

    @Test
    public void getTransactions_NullAnd_NotNull() {
        assertNull(transactionResponse.getTransactions());
        Transaction transaction = new Transaction();
        transaction.setId("txn_id_01");
        transactionResponse.setTransactions(Collections.singletonList(transaction));
        assertNotNull(transactionResponse.getTransactions());
        assertEquals("txn_id_01", transactionResponse.getTransactions().get(0).getId());

    }
}