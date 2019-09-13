package com.backbase.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Holder {
    private String name;
    @JsonProperty("is_alias")
    private boolean alias;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlias() {
        return alias;
    }

    public void setAlias(boolean alias) {
        this.alias = alias;
    }
}
