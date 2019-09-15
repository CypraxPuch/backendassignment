package com.backbase.data.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 1:15 PM<br/>
 * Generated to
 */
public class BankTest {

    private Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank();
    }

    @Test
    public void getNationalIdentifier_NullAnd_NotNull() {
        assertNull(bank.getNationalIdentifier());
        String nationalIdentifier = "nationalIdentifier_01";
        bank.setNationalIdentifier(nationalIdentifier);
        assertNotNull(bank.getNationalIdentifier());
        assertEquals(nationalIdentifier, bank.getNationalIdentifier());
    }

    @Test
    public void getName_NullAnd_NotNull() {
        assertNull(bank.getName());
        String name = "name";
        bank.setName(name);
        assertNotNull(bank.getName());
        assertEquals(name, bank.getName());
    }
}