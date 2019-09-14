package com.backbase.data.entity;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/13/19<br/>
 * Time: 9:02 PM<br/>
 * Generated to
 */
public class TotalAmountByTxnType {
    private String transactionType;
    private BigDecimal totalAmount;

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
