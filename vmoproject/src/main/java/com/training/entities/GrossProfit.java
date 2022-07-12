package com.training.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.text.DecimalFormat;
import java.time.ZonedDateTime;
@Document(collection = "gross_profit")
public class GrossProfit {

    private Double percent;
    private ZonedDateTime effectiveDate;
    private ZonedDateTime expiredDate;

    private Segments segments;

    public GrossProfit() {
    }

    public GrossProfit(Double percent, ZonedDateTime effectiveDate, ZonedDateTime expiredDate, Segments segments) {
        this.percent = percent;
        this.effectiveDate = effectiveDate;
        this.expiredDate = expiredDate;
        this.segments = segments;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public ZonedDateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(ZonedDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public ZonedDateTime getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(ZonedDateTime expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Segments getSegments() {
        return segments;
    }

    public void setSegments(Segments segments) {
        this.segments = segments;
    }
}
