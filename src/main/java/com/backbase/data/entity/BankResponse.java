package com.backbase.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/13/19<br/>
 * Time: 7:47 PM<br/>
 * Generated to
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankResponse {
    List<BankInfo> banks;

    public List<BankInfo> getBanks() {
        return banks;
    }

    public void setBanks(List<BankInfo> banks) {
        this.banks = banks;
    }
}
