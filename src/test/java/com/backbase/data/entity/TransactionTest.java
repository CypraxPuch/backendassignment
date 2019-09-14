package com.backbase.data.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 2:15 PM<br/>
 * Generated to
 */
public class TransactionTest {

    private Transaction transaction;

    @Before
    public void setUp() throws Exception {
        transaction = new Transaction();
    }

    @Test
    public void getId_NullAnd_NotNull() {
        assertNull(transaction.getId());
        String id = "id_01";
        transaction.setId(id);
        assertNotNull(transaction.getId());
        assertEquals(id, transaction.getId());
    }

    @Test
    public void getThisAccount_NullAnd_NotNull() {
        assertNull(transaction.getThisAccount());
        String thisAccountId = "this_account_01";
        Account account = new Account();
        account.setId(thisAccountId);
        transaction.setThisAccount(account);
        assertNotNull(transaction.getThisAccount());
        //this only check one property as the account content validation is in AccountTest
        assertEquals(thisAccountId, transaction.getThisAccount().getId());
    }

    @Test
    public void getOtherAccount_NullAnd_NotNull() {
        assertNull(transaction.getOtherAccount());
        String otherAccountId = "other_account_01";
        Account account = new Account();
        account.setId(otherAccountId);
        transaction.setOtherAccount(account);
        assertNotNull(transaction.getOtherAccount());
        //this only check one property as the account content validation is in AccountTest
        assertEquals(otherAccountId, transaction.getOtherAccount().getId());
    }

    @Test
    public void getDetails_NullAnd_NotNull() {
        assertNull(transaction.getDetails());
        String type = "type_01";
        Details details = new Details();
        details.setType(type);
        transaction.setDetails(details);
        assertNotNull(transaction.getDetails());
        //this only check one property as the account content validation is in AccountTest
        assertEquals(details.getType(), transaction.getDetails().getType());
    }

    @Test
    public void getMetadata_NullAnd_NotNull() {
        assertNull(transaction.getMetadata());
        String moreInfo = "more_info_01";
        Metadata metadata = new Metadata();
        metadata.setMoreInfo(moreInfo);
        transaction.setMetadata(metadata);
        assertNotNull(transaction.getMetadata());
        //this only check one property as the metadata content validation is in MetadataTest
        assertEquals(moreInfo, transaction.getMetadata().getMoreInfo());
    }
}