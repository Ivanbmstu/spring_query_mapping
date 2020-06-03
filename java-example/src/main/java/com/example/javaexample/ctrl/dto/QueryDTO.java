package com.example.javaexample.ctrl.dto;

import java.util.List;

public class QueryDTO {
    private List<String> values;
    private String type;

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}