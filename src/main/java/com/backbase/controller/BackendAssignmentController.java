package com.backbase.controller;

import com.backbase.data.dao.OpenBankDao;
import com.backbase.data.entity.Transaction;
import com.backbase.data.to.TransactionTo;
import com.backbase.service.BackbaseService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transaction")
public class BackendAssignmentController {

    private BackbaseService backbaseService;

    public BackendAssignmentController(@Qualifier("backbaseService") BackbaseService backbaseService) {
        this.backbaseService = backbaseService;
    }

    @RequestMapping(value = {"/list","/"}, method = RequestMethod.GET)
    public List<TransactionTo> getTransactions() {
        System.out.println("entering to get transactions list ");
        Optional<List<TransactionTo>> optTxnLst = backbaseService.getTransactionList();
        return optTxnLst.orElse(new ArrayList<>());
    }

    @RequestMapping(value = "/type/{transactionType}", method = RequestMethod.GET)
    public String getTransactionByType(@PathVariable String transactionType) {
        System.out.println("transaction by txn type ");
        String result = "Txn type: " + transactionType;

        return result;
    }

    @RequestMapping(value = "/amount/{transactionType}", method = RequestMethod.GET)
    public String getTotalAmountByTxnType(@PathVariable String transactionType) {
        System.out.println("Total amount by txn type ");
        String result = "Total amount Txn type: " + transactionType;

        return result;
    }

}
