package com.backbase.data.entity;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 1:11 PM<br/>
 * Generated to
 */
public class BalanceTest {

    private Balance balance;
    @Before
    public void setUp() throws Exception {
        balance = new Balance();
    }

    @Test
    public void getCurrency_NullAnd_NotNull() {
        assertNull(balance.getCurrency());
        String currency = "currency_01";
        balance.setCurrency(currency);
        assertNotNull(balance.getCurrency() );
        assertEquals(currency, balance.getCurrency() );
    }

    @Test
    public void getAmount_NullAnd_NotNull() {
        assertNull(balance.getAmount());
        BigDecimal amount = new BigDecimal("10.55");
        balance.setAmount(amount);
        assertNotNull(balance.getAmount() );
        assertEquals(amount, balance.getAmount() );
    }
}