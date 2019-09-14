package com.backbase.data.entity;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 1:23 PM<br/>
 * Generated to
 */
public class BankResponseTest {
    private List<BankInfo> banks;
    private BankResponse bankResponse;

    @Before
    public void setUp() throws Exception {
        banks = new ArrayList<>();
        bankResponse = new BankResponse();
    }

    @Test
    public void getBanks_NullAnd_NotNull() {
        assertNull(bankResponse.getBanks());
        BankInfo bankInfo = new BankInfo();
        bankInfo.setId("bank_info_id_01");
        banks.add(bankInfo);
        bankResponse.setBanks(banks);
        assertNotNull(bankResponse.getBanks());
        //this only check the list size and one property as the bank info validation is in BankInfoTest
        assertEquals(1, bankResponse.getBanks().size());
        assertEquals("bank_info_id_01", bankResponse.getBanks().get(0).getId());
    }
}