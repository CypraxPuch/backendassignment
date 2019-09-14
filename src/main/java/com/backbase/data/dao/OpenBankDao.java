package com.backbase.data.dao;

import com.backbase.data.entity.BankInfo;
import com.backbase.data.entity.Transaction;
import com.backbase.data.entity.TransactionResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OpenBankDao {
    private String URL_TXN_LIST = "https://apisandbox.openbankproject.com/obp/v1.2.1/banks/%1$s/accounts/%2$s/%3$s/transactions";
    private String URL_BANK = "https://apisandbox.openbankproject.com/obp/v1.2.1/banks/%1$s";

    private RestTemplate restTemplate;

    public OpenBankDao(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Optional<List<Transaction>> getTransactionList(String bankId, String accountId, String viewId) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        ResponseEntity<TransactionResponse> rateResponse =
                restTemplate.exchange(String.format(URL_TXN_LIST, bankId, accountId, viewId)
                        , HttpMethod.GET
                        , entity
                        , new ParameterizedTypeReference<TransactionResponse>(){});
        Optional<List<Transaction>> optional = Optional.empty();
        if (rateResponse.getBody() != null) {
            TransactionResponse body = rateResponse.getBody();
            optional = Optional.of(body.getTransactions());
        }
        return optional;
    }

    public Optional<BankInfo> getBank(String bankId) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        ResponseEntity<BankInfo> rateResponse =
                restTemplate.exchange(String.format(URL_BANK, bankId)
                        , HttpMethod.GET
                        , entity
                        , new ParameterizedTypeReference<BankInfo>() {

                        });
        Optional<BankInfo> optional = Optional.empty();
        if (rateResponse.getBody() != null) {
            BankInfo body = rateResponse.getBody();
            optional = Optional.of(body);
        }
        return optional;
    }

}
