package com.backbase.data.entity;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 12:35 PM<br/>
 * Generated to
 */
public class AccountTest {
    private Account account;

    @Before
    public void setUp() throws Exception {
        account = new Account();
    }

    @Test
    public void getId_NullAnd_NotNull() {
        assertNull(account.getId());
        String accountId = "account_id_01";
        account.setId(accountId);
        assertNotNull(account.getId());
        assertEquals(accountId, account.getId());
    }

    @Test
    public void getHolders_NullAnd_NotNull() {
        assertNull(account.getHolders());
        Holder h1 = new Holder();
        h1.setName("holder_01");
        Holder h2 = new Holder();
        h2.setName("holder_02");
        account.setHolders(Arrays.asList(h1, h2));
        assertNotNull(account.getHolders());
        //this only check the list size as the holders content validation is in HolderTest
        assertEquals(2, account.getHolders().size());
    }

    @Test
    public void getHolder_NullAnd_NotNull() {
        assertNull(account.getHolder());
        Holder h1 = new Holder();
        h1.setName("holder_03");
        account.setHolder(h1);
        assertNotNull(account.getHolder());
        assertEquals("holder_03", account.getHolder().getName());
    }

    @Test
    public void getNumber_NullAnd_NotNull() {
        assertNull(account.getNumber());
        String number = "number_01";
        account.setNumber(number);
        assertNotNull(account.getNumber());
        assertEquals(number, account.getNumber());
    }

    @Test
    public void getKind_NullAnd_NotNull() {
        assertNull(account.getKind());
        String kind = "kind_01";
        account.setKind(kind);
        assertNotNull(account.getKind());
        assertEquals(kind, account.getKind());
    }

    @Test
    public void getIban_NullAnd_NotNull() {
        assertNull(account.getIban());
        String iban = "iban_01";
        account.setIban(iban);
        assertNotNull(account.getIban());
        assertEquals(iban, account.getIban());
    }

    @Test
    public void getSwiftBic_NullAnd_NotNull() {
        assertNull(account.getSwiftBic());
        String swiftBic = "swiftBic";
        account.setSwiftBic(swiftBic);
        assertNotNull(account.getSwiftBic());
        assertEquals(swiftBic, account.getSwiftBic());
    }

    @Test
    public void getBank_NullAnd_NotNull() {
        assertNull(account.getBank());
        Bank bank = new Bank();
        bank.setName("bank_01");
        account.setBank(bank);
        assertNotNull(account.getBank());
        //this only check one property as the bank content validation is in BankTest
        assertEquals("bank_01", account.getBank().getName());
    }

    @Test
    public void getMetadata_NullAnd_NotNull() {
        assertNull(account.getMetadata());
        Metadata metadata = new Metadata();
        metadata.setPublicAlias("public_alias_01");
        account.setMetadata(metadata);
        assertNotNull(account.getMetadata());
        assertEquals("public_alias_01", account.getMetadata().getPublicAlias());
    }
}