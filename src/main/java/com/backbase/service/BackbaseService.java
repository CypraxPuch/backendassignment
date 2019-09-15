package com.backbase.service;

import com.backbase.data.dao.OpenBankDao;
import com.backbase.data.entity.BankInfo;
import com.backbase.data.entity.TotalAmountByTxnType;
import com.backbase.data.entity.Transaction;
import com.backbase.data.to.TransactionTo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BackbaseService {

    private OpenBankDao openBankDao;

    public BackbaseService(OpenBankDao openBankDao) {
        this.openBankDao = openBankDao;
    }

    public Optional<List<TransactionTo>> getTransactionList(String bankId, String accountId, String viewId) {
        List<TransactionTo> lstTo = null;
        Optional<List<Transaction>> optTransactionList = openBankDao.getTransactionList(bankId, accountId, viewId);

        if (optTransactionList.isPresent()) {
            lstTo = optTransactionList.get().stream()
                    .map(t -> {
                        TransactionTo to = new TransactionTo();
                        to.setId(t.getId());
                        to.setAccountId(t.getThisAccount().getId());
                        to.setCounterpartyAccount(t.getOtherAccount().getNumber());
                        to.setCounterpartyName(t.getOtherAccount().getHolder().getName());
                        to.setCounterPartyLogoPath(t.getOtherAccount().getMetadata().getImageUrl());
                        to.setInstructedAmount(t.getDetails().getValue().getAmount());
                        to.setInstructedCurrency(t.getDetails().getValue().getCurrency());
                        to.setTransactionAmount(t.getDetails().getValue().getAmount());
                        to.setTransactionCurrency(t.getDetails().getValue().getCurrency());
                        to.setTransactionType(t.getDetails().getType());
                        to.setDescription(t.getDetails().getDescription());
                        return to;
                    }).collect(Collectors.toList());

        }
        return Optional.ofNullable(lstTo);
    }

    public boolean validBank(String bankId) {
        Optional<BankInfo> optBank = openBankDao.getBank(bankId);
        return optBank.isPresent();
    }

    public Optional<List<TransactionTo>> getTransactionByTxnType(String txnType, String bankId, String accountId, String viewId) {
        List<TransactionTo> lstTo = null;
        Optional<List<Transaction>> optTransactionList = openBankDao.getTransactionList(bankId, accountId, viewId);

        if (optTransactionList.isPresent()) {
            lstTo = optTransactionList.get().stream()
                    .filter(l -> l.getDetails() != null
                            && l.getDetails().getType() != null
                            && l.getDetails().getType().equalsIgnoreCase(txnType))
                    .map(t -> {
                        TransactionTo to = new TransactionTo();
                        to.setId(t.getId());
                        to.setAccountId(t.getThisAccount().getId());
                        to.setCounterpartyAccount(t.getOtherAccount().getNumber());
                        to.setCounterpartyName(t.getOtherAccount().getHolder().getName());
                        to.setCounterPartyLogoPath(t.getOtherAccount().getMetadata().getImageUrl());
                        to.setInstructedAmount(t.getDetails().getValue().getAmount());
                        to.setInstructedCurrency(t.getDetails().getValue().getCurrency());
                        to.setTransactionAmount(t.getDetails().getValue().getAmount());
                        to.setTransactionCurrency(t.getDetails().getValue().getCurrency());
                        to.setTransactionType(t.getDetails().getType());
                        to.setDescription(t.getDetails().getDescription());
                        return to;
                    }).collect(Collectors.toList());

        }
        return Optional.ofNullable(lstTo);
    }

    public Optional<TotalAmountByTxnType> getTotalAmountByTxnType(String txnType, String bankId, String accountId, String viewId) {
        TotalAmountByTxnType totalAmountByTxnType = null;
        Optional<List<Transaction>> optTransactionList = openBankDao.getTransactionList(bankId, accountId, viewId);

        if (optTransactionList.isPresent()) {
            totalAmountByTxnType = new TotalAmountByTxnType();
            totalAmountByTxnType.setTransactionType(txnType);
            totalAmountByTxnType.setTotalAmount(
                    optTransactionList.get().stream()
                            .filter(l -> l.getDetails() != null
                                    && l.getDetails().getType() != null
                                    && l.getDetails().getType().equalsIgnoreCase(txnType))
                            .map(t -> t.getDetails().getValue().getAmount())
                            .reduce(BigDecimal.ZERO, BigDecimal::add)
            );

        }
        return Optional.ofNullable(totalAmountByTxnType);
    }
}
