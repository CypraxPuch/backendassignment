package com.backbase.data.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 1:17 PM<br/>
 * Generated to
 */
public class BankInfoTest {

    private BankInfo bankInfo;
    @Before
    public void setUp() throws Exception {
        bankInfo = new BankInfo();
    }

    @Test
    public void getId_NullAnd_NotNull() {
        assertNull(bankInfo.getId());
        String id = "id_01";
        bankInfo.setId(id);
        assertNotNull(bankInfo.getId() );
        assertEquals(id, bankInfo.getId() );
    }

    @Test
    public void getShortName_NullAnd_NotNull() {
        assertNull(bankInfo.getShortName());
        String shortName = "shortName_01";
        bankInfo.setShortName(shortName);
        assertNotNull(bankInfo.getShortName() );
        assertEquals(shortName, bankInfo.getShortName() );
    }

    @Test
    public void getFullName_NullAnd_NotNull() {
        assertNull(bankInfo.getFullName());
        String fullName = "fullName_01";
        bankInfo.setFullName(fullName);
        assertNotNull(bankInfo.getFullName() );
        assertEquals(fullName, bankInfo.getFullName() );
    }

    @Test
    public void getLogo_NullAnd_NotNull() {
        assertNull(bankInfo.getLogo());
        String logo = "logo_01";
        bankInfo.setLogo(logo);
        assertNotNull(bankInfo.getLogo() );
        assertEquals(logo, bankInfo.getLogo() );
    }

    @Test
    public void getWebsite_NullAnd_NotNull() {
        assertNull(bankInfo.getWebsite());
        String website = "website_01";
        bankInfo.setWebsite(website);
        assertNotNull(bankInfo.getWebsite() );
        assertEquals(website, bankInfo.getWebsite() );
    }
}