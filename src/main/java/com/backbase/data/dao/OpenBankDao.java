package com.backbase.data.dao;

import com.backbase.data.entity.Transaction;
import com.backbase.data.entity.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OpenBankDao {
    private final String URL_LIST = "https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions";

    private RestTemplate restTemplate;

    public OpenBankDao(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Optional<List<Transaction>> getTransactionList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        ResponseEntity<TransactionResponse> rateResponse =
                restTemplate.exchange(URL_LIST
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

}
