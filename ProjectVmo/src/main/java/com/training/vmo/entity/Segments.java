package com.training.vmo.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "segments" )
public class Segments {
    @Field("type")
    private String type;
    @Field("value")
    private Double value;

    public Segments() {
    }

    public Segments(String type, Double value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
