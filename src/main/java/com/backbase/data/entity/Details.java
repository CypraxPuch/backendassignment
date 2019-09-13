package com.backbase.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Details {
    private String type;
    private String description;
    private String posted;
    private String completed;
    @JsonProperty("new_balance")
    private Balance newBalance;
    @JsonProperty("value")
    private Balance value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPosted() {
        return posted;
    }

    public void setPosted(String posted) {
        this.posted = posted;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public Balance getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(Balance newBalance) {
        this.newBalance = newBalance;
    }

    public Balance getValue() {
        return value;
    }

    public void setValue(Balance value) {
        this.value = value;
    }
}
