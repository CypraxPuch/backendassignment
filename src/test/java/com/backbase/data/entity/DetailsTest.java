package com.backbase.data.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 1:33 PM<br/>
 * Generated to
 */
public class DetailsTest {

    private Details details;

    @Before
    public void setUp() throws Exception {
        details = new Details();
    }

    @Test
    public void getType_NullAnd_NotNull() {
        assertNull(details.getType());
        String type = "type_01";
        details.setType(type);
        assertNotNull(details.getType());
        assertEquals(type, details.getType());
    }

    @Test
    public void getDescription_NullAnd_NotNull() {
        assertNull(details.getDescription());
        String description = "description_01";
        details.setDescription(description);
        assertNotNull(details.getDescription());
        assertEquals(description, details.getDescription());
    }

    @Test
    public void getPosted_NullAnd_NotNull() {
        assertNull(details.getPosted());
        String posted = "posted_01";
        details.setPosted(posted);
        assertNotNull(details.getPosted());
        assertEquals(posted, details.getPosted());
    }

    @Test
    public void getCompleted_NullAnd_NotNull() {
        assertNull(details.getCompleted());
        String completed = "completed_01";
        details.setCompleted(completed);
        assertNotNull(details.getCompleted());
        assertEquals(completed, details.getCompleted());
    }

    @Test
    public void getNewBalance_NullAnd_NotNull() {
        Balance balance = new Balance();
        assertNull(details.getNewBalance());
        String currency = "currency_01";
        balance.setCurrency(currency);
        details.setNewBalance(balance);
        assertNotNull(details.getNewBalance());
        //this only check one property as the balance content validation is in BalanceTest
        assertEquals(balance.getCurrency(), details.getNewBalance().getCurrency());
    }

    @Test
    public void getValue_NullAnd_NotNull() {
        Balance value = new Balance();
        assertNull(details.getValue());
        String currency = "currency_01";
        value.setCurrency(currency);
        details.setValue(value);
        assertNotNull(details.getValue());
        //this only check one property as the balance content validation is in BalanceTest
        assertEquals(value.getCurrency(), details.getValue().getCurrency());
    }
}