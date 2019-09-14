package com.backbase.data.dao;

import com.backbase.data.entity.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/13/19<br/>
 * Time: 10:46 PM<br/>
 * Generated to
 */
public class OpenBankDaoTest {
    private OpenBankDao openBankDao;

    @Before
    public void setUp() throws Exception {
        openBankDao = new OpenBankDao(new RestTemplate());
    }

    @Test
    public void getTransactionList() {
        String bankId = "rbs";
        String accountId = "savings-kids-john";
        String viewId = "public";
        String txnId = "07dce7b9-448b-4ad6-89ef-ab2705aa3a37";
        Optional<List<Transaction>> optListTxn = openBankDao.getTransactionList(bankId, accountId, viewId);
        assertNotNull(optListTxn);
        assertTrue(optListTxn.isPresent());
        List<Transaction> transactionList = optListTxn.orElse(new ArrayList<>());
        assertNotNull(transactionList);
        assertFalse(transactionList.isEmpty());
        Optional<Transaction> first = transactionList.stream()
                .filter(t -> t.getId().equalsIgnoreCase(txnId))
                .findFirst();
        assertNotNull(first);
        Transaction txn = first.orElse(new Transaction());
        assertNotNull(txn);
        assertEquals(txnId, txn.getId());

        assertNotNull(txn.getThisAccount());
        Account thisAccount = txn.getThisAccount();
        assertEquals(accountId, thisAccount.getId());
        assertNotNull(thisAccount.getHolders());
        Holder holder = thisAccount.getHolders().get(0);
        assertNotNull(holder);
        assertEquals("Savings - Kids John", holder.getName());
        assertFalse(holder.isAlias());
        assertEquals("832425-00304050", thisAccount.getNumber());
        assertEquals("savings", thisAccount.getKind());
        assertNull(thisAccount.getIban());
        assertNull(thisAccount.getSwiftBic());
        assertNotNull(thisAccount.getBank());
        Bank bank = thisAccount.getBank();
        assertEquals("rbs", bank.getNationalIdentifier());
        assertEquals("The Royal Bank of Scotland", bank.getName());

        assertNotNull(txn.getOtherAccount());
        Account otherAccount = txn.getOtherAccount();
        assertEquals("NeeYeE-h17DSVCwXpYAz0Zqw7R3X24OkzTe6vBlJcgw", otherAccount.getId());
        assertNotNull(otherAccount.getHolder());
        Holder otherHolder = otherAccount.getHolder();
        assertNotNull(otherHolder);
        assertEquals("ALIAS_4DF326", otherHolder.getName());
        assertTrue(otherHolder.isAlias());
        assertEquals(accountId, otherAccount.getNumber());
        assertEquals("CURRENT PLUS", otherAccount.getKind());
        assertNull(otherAccount.getIban());
        assertNull(otherAccount.getSwiftBic());
        assertNotNull(otherAccount.getBank());
        Bank otherBank = otherAccount.getBank();
        assertNull(otherBank.getNationalIdentifier());
        assertEquals("rbs", otherBank.getName());
        assertNotNull(otherAccount.getMetadata());
        Metadata metadata = otherAccount.getMetadata();
        assertNotNull(metadata);
        assertNull(metadata.getPublicAlias());
        assertNull(metadata.getPrivateAlias());
        assertNull(metadata.getMoreInfo());
        assertNull(metadata.getUrl());
        assertNull(metadata.getImageUrl());
        assertNull(metadata.getOpenCorporatesUrl());
        assertNull(metadata.getCorporateLocation());
        assertNull(metadata.getPhysicalLocation());

        Details details = txn.getDetails();
        assertNotNull(details);
        assertEquals("sandbox-payment", details.getType());
        assertNull(details.getDescription());
        assertEquals("2016-02-01T14:48:57Z", details.getPosted());
        assertEquals("2016-02-01T14:48:57Z", details.getCompleted());
        assertNotNull(details.getNewBalance());
        Balance newBalance = details.getNewBalance();
        assertEquals("GBP", newBalance.getCurrency());
        assertNull(newBalance.getAmount());
        Balance value = details.getValue();
        assertEquals("GBP", value.getCurrency());
        assertEquals(new BigDecimal("10.99"), value.getAmount());

        assertNotNull(txn.getMetadata());
        Metadata metadata1 = txn.getMetadata();
        assertNull(metadata1.getNarrative());
        assertTrue(metadata1.getComments().isEmpty());
        assertTrue(metadata1.getTags().isEmpty());
        assertTrue(metadata1.getImages().isEmpty());
        assertNull(metadata1.getWhere());
    }

    @Test
    public void getBank() {
        String bankId = "nordea";
        Optional<BankInfo> optBankInfo = openBankDao.getBank(bankId);
        assertNotNull(optBankInfo);
        assertTrue(optBankInfo.isPresent());
        BankInfo bankInfo = optBankInfo.orElse(new BankInfo());
        assertNotNull(bankInfo);
        assertEquals(bankId, bankInfo.getId());
        assertEquals("Nordea", bankInfo.getShortName());
        assertEquals("Nordea Bank AB", bankInfo.getFullName());
        assertEquals("http://logonoid.com/images/nordea-logo.jpg", bankInfo.getLogo());
        assertEquals("http://www.nordea.com/", bankInfo.getWebsite());
    }
}