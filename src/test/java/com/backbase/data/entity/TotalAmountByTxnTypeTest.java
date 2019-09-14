package com.backbase.data.entity;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 2:05 PM<br/>
 * Generated to
 */
public class TotalAmountByTxnTypeTest {

    private TotalAmountByTxnType totalAmountByTxnType;

    @Before
    public void setUp() throws Exception {
        totalAmountByTxnType = new TotalAmountByTxnType();
    }

    @Test
    public void getTransactionType_NullAnd_NotNull() {
        assertNull(totalAmountByTxnType.getTransactionType());
        String transactionType = "transaction_type_01";
        totalAmountByTxnType.setTransactionType(transactionType);
        assertNotNull(totalAmountByTxnType.getTransactionType());
        assertEquals(transactionType, totalAmountByTxnType.getTransactionType());
    }

    @Test
    public void getTotalAmount_NullAnd_NotNull() {
        assertNull(totalAmountByTxnType.getTotalAmount());
        BigDecimal totalAmount = new BigDecimal("158.06");
        totalAmountByTxnType.setTotalAmount(totalAmount);
        assertNotNull(totalAmountByTxnType.getTotalAmount());
        assertEquals(totalAmount, totalAmountByTxnType.getTotalAmount());
    }
}