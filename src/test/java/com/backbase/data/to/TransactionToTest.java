package com.backbase.data.to;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 2:27 PM<br/>
 * Generated to
 */
public class TransactionToTest {

    private TransactionTo transactionTo;

    @Before
    public void setUp() throws Exception {
        transactionTo = new TransactionTo();
    }

    @Test
    public void getId_NullAnd_NotNull() {
        assertNull(transactionTo.getId());
        String id = "id_01";
        transactionTo.setId(id);
        assertNotNull(transactionTo.getId());
        assertEquals(id, transactionTo.getId());
    }

    @Test
    public void getAccountId() {
        assertNull(transactionTo.getAccountId());
        String accountId = "account_id_01";
        transactionTo.setAccountId(accountId);
        assertNotNull(transactionTo.getAccountId());
        assertEquals(accountId, transactionTo.getAccountId());
    }

    @Test
    public void getCounterpartyAccount() {
        assertNull(transactionTo.getCounterpartyAccount());
        String counterpartyAccount = "counterparty_account_01";
        transactionTo.setCounterpartyAccount(counterpartyAccount);
        assertNotNull(transactionTo.getCounterpartyAccount());
        assertEquals(counterpartyAccount, transactionTo.getCounterpartyAccount());
    }

    @Test
    public void getCounterpartyName() {
        assertNull(transactionTo.getCounterpartyName());
        String counterpartyName = "counterparty_name_01";
        transactionTo.setCounterpartyName(counterpartyName);
        assertNotNull(transactionTo.getCounterpartyName());
        assertEquals(counterpartyName, transactionTo.getCounterpartyName());
    }

    @Test
    public void getCounterPartyLogoPath() {
        assertNull(transactionTo.getCounterPartyLogoPath());
        String counterpartyLogoPath = "counterparty_logo_path_01";
        transactionTo.setCounterPartyLogoPath(counterpartyLogoPath);
        assertNotNull(transactionTo.getCounterPartyLogoPath());
        assertEquals(counterpartyLogoPath, transactionTo.getCounterPartyLogoPath());
    }

    @Test
    public void getInstructedAmount() {
        assertNull(transactionTo.getInstructedAmount());
        BigDecimal instructedAmount = new BigDecimal("756.12");
        transactionTo.setInstructedAmount(instructedAmount);
        assertNotNull(transactionTo.getInstructedAmount());
        assertEquals(instructedAmount, transactionTo.getInstructedAmount());
    }

    @Test
    public void getInstructedCurrency() {
        assertNull(transactionTo.getInstructedCurrency());
        String instructedCurrency = "instructed_currency_01";
        transactionTo.setInstructedCurrency(instructedCurrency);
        assertNotNull(transactionTo.getInstructedCurrency());
        assertEquals(instructedCurrency, transactionTo.getInstructedCurrency());
    }

    @Test
    public void getTransactionAmount() {
        assertNull(transactionTo.getTransactionAmount());
        BigDecimal transactionAmount = new BigDecimal("127.93");
        transactionTo.setTransactionAmount(transactionAmount);
        assertNotNull(transactionTo.getTransactionAmount());
        assertEquals(transactionAmount, transactionTo.getTransactionAmount());
    }

    @Test
    public void getTransactionCurrency() {
        assertNull(transactionTo.getTransactionCurrency());
        String transactionCurrency = "transaction_currency_01";
        transactionTo.setTransactionCurrency(transactionCurrency);
        assertNotNull(transactionTo.getTransactionCurrency());
        assertEquals(transactionCurrency, transactionTo.getTransactionCurrency());
    }

    @Test
    public void getTransactionType() {
        assertNull(transactionTo.getTransactionType());
        String transactionType = "transaction_type_01";
        transactionTo.setTransactionType(transactionType);
        assertNotNull(transactionTo.getTransactionType());
        assertEquals(transactionType, transactionTo.getTransactionType());
    }

    @Test
    public void getDescription() {
        assertNull(transactionTo.getDescription());
        String description = "description_01";
        transactionTo.setDescription(description);
        assertNotNull(transactionTo.getDescription());
        assertEquals(description, transactionTo.getDescription());
    }
}