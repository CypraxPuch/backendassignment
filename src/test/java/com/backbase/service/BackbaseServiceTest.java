package com.backbase.service;

import com.backbase.data.dao.OpenBankDao;
import com.backbase.data.entity.TotalAmountByTxnType;
import com.backbase.data.to.TransactionTo;
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
 * Time: 9:55 PM<br/>
 * Generated to
 */
public class BackbaseServiceTest {

    private BackbaseService service;

    @Before
    public void setUp() {
        service = new BackbaseService(new OpenBankDao(new RestTemplate()));
    }

    @Test
    public void getTransactionList() {
        String bankId = "rbs";
        String accountId = "savings-kids-john";
        String viewId = "public";
        String txnId = "897706c1-dcc6-4e70-9d85-8a537c7cbf3e";

        Optional<List<TransactionTo>> optTransactionList = service.getTransactionList(bankId, accountId, viewId);
        assertNotNull(optTransactionList);
        Optional<TransactionTo> first = optTransactionList.orElse(new ArrayList<>()).stream()
                .filter(to -> to.getId().equalsIgnoreCase(txnId))
                .findFirst();
        assertNotNull(first);
        assertTrue(first.isPresent());
        TransactionTo transactionTo = first.get();
        assertEquals(txnId, transactionTo.getId());
        assertEquals(accountId, transactionTo.getAccountId());
        assertEquals(accountId, transactionTo.getCounterpartyAccount());
        assertEquals("ALIAS_49532E", transactionTo.getCounterpartyName());
        assertNull(transactionTo.getCounterPartyLogoPath());
        assertEquals(new BigDecimal("-90.00"), transactionTo.getInstructedAmount());
        assertEquals("GBP", transactionTo.getInstructedCurrency());
        assertEquals(new BigDecimal("-90.00"), transactionTo.getTransactionAmount());
        assertEquals("GBP", transactionTo.getTransactionCurrency());
        assertEquals("SANDBOX_TAN", transactionTo.getTransactionType());
        assertEquals("Gift", transactionTo.getDescription());
    }

    @Test
    public void validBank() {
        String bankId = "rbs";

        boolean validBank = service.validBank(bankId);
        assertTrue(validBank);
    }

    @Test
    public void invalidBank() {
        String bankId = "pucheta";

        boolean validBank = service.validBank(bankId);
        assertFalse(validBank);
    }

    @Test
    public void getTransactionByTxnType() {
        String bankId = "rbs";
        String accountId = "savings-kids-john";
        String viewId = "public";
        String txnType = "SANDBOX_TAN";
        String txnId = "a96603e1-7408-485f-8baf-0ff13fdb9655";

        Optional<List<TransactionTo>> optTransactionList = service.getTransactionByTxnType(txnType, bankId, accountId, viewId);
        assertNotNull(optTransactionList);
        Optional<TransactionTo> first = optTransactionList.orElse(new ArrayList<>()).stream()
                .filter(to -> to.getId().equalsIgnoreCase(txnId))
                .findFirst();
        assertNotNull(first);
        assertTrue(first.isPresent());
        TransactionTo transactionTo = first.get();
        assertEquals(txnId, transactionTo.getId());
        assertEquals(accountId, transactionTo.getAccountId());
        assertEquals(accountId, transactionTo.getCounterpartyAccount());
        assertEquals("ALIAS_49532E", transactionTo.getCounterpartyName());
        assertNull(transactionTo.getCounterPartyLogoPath());
        assertEquals(new BigDecimal("100.00"), transactionTo.getInstructedAmount());
        assertEquals("GBP", transactionTo.getInstructedCurrency());
        assertEquals(new BigDecimal("100.00"), transactionTo.getTransactionAmount());
        assertEquals("GBP", transactionTo.getTransactionCurrency());
        assertEquals("SANDBOX_TAN", transactionTo.getTransactionType());
        assertEquals("Birthday Gift", transactionTo.getDescription());
    }

    @Test
    public void getTotalAmountByTxnType() {
        String bankId = "rbs";
        String accountId = "savings-kids-john";
        String viewId = "public";
        String txnType = "sandbox-payment";

        Optional<TotalAmountByTxnType> totalAmountByTxnType = service.getTotalAmountByTxnType(txnType, bankId, accountId, viewId);
        assertNotNull(totalAmountByTxnType);
        assertTrue(totalAmountByTxnType.isPresent());
        TotalAmountByTxnType totalAmountByTxnType1 = totalAmountByTxnType.orElse(new TotalAmountByTxnType());
        assertEquals(txnType, totalAmountByTxnType1.getTransactionType());
        assertEquals(new BigDecimal("73.76"), totalAmountByTxnType1.getTotalAmount());
    }
}