package com.example.javaexample.ctrl.dto;

import java.util.List;

public final class QueryConstructorDTO {
    private final List<String> values;
    private final String type;

    @java.beans.ConstructorProperties({"values", "type"})
    public QueryConstructorDTO(List<String> values, String type) {
        this.values = values;
        this.type = type;
    }

    public List<String> getValues() {
        return this.values;
    }

    public String getType() {
        return this.type;
    }
}