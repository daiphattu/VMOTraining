package com.training.vmo.dto;

import org.springframework.data.mongodb.core.mapping.Field;

public class SegmentsDTO {

    private String type;

    private Double value;

    public SegmentsDTO() {
    }

    public SegmentsDTO(String type, Double value) {
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
