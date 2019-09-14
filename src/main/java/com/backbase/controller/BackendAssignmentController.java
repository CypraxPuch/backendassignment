package com.backbase.controller;

import com.backbase.data.entity.TotalAmountByTxnType;
import com.backbase.data.to.TransactionTo;
import com.backbase.service.BackbaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static Logger logger = LoggerFactory.getLogger(BackendAssignmentController.class);

    private BackbaseService backbaseService;

    public BackendAssignmentController(@Qualifier("backbaseService") BackbaseService backbaseService) {
        this.backbaseService = backbaseService;
    }

    @RequestMapping(value = {"/list/{bankId}/{accountId}/{viewId}"}, method = RequestMethod.GET)
    public List<TransactionTo> getTransactions(@PathVariable String bankId, @PathVariable String accountId, @PathVariable String viewId) {
        if( !backbaseService.validBank(bankId) ){
            logger.info("invalid bank id");
            return new ArrayList<>();
        }

        logger.debug("entering to get transactions list ");
        Optional<List<TransactionTo>> optTxnLst = backbaseService.getTransactionList(bankId, accountId, viewId);
        return optTxnLst.orElse(new ArrayList<>());
    }

    @RequestMapping(value = "/type/{transactionType}/{bankId}/{accountId}/{viewId}", method = RequestMethod.GET)
    public List<TransactionTo> getTransactionByType(@PathVariable String transactionType, @PathVariable String bankId, @PathVariable String accountId, @PathVariable String viewId) {
        if( !backbaseService.validBank(bankId) ){
            logger.info("invalid bank id");
            return new ArrayList<>();
        }

        logger.debug("listing transactions by txn type ");
        Optional<List<TransactionTo>> optTxnLst = backbaseService.getTransactionByTxnType(transactionType, bankId, accountId, viewId);
        return optTxnLst.orElse(new ArrayList<>());
    }

    @RequestMapping(value = "/amount/{transactionType}/{bankId}/{accountId}/{viewId}", method = RequestMethod.GET)
    public TotalAmountByTxnType getTotalAmountByTxnType(@PathVariable String transactionType, @PathVariable String bankId, @PathVariable String accountId, @PathVariable String viewId) {
        if( !backbaseService.validBank(bankId) ){
            logger.info("invalid bank id");
            return new TotalAmountByTxnType();
        }

        logger.debug("Total amount by txn type ");
        Optional<TotalAmountByTxnType> totalAmountByTxnType = backbaseService.getTotalAmountByTxnType(transactionType, bankId, accountId, viewId);
        return totalAmountByTxnType.orElse(new TotalAmountByTxnType());
    }

}
