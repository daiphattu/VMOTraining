package com.training.vmo.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.text.DecimalFormat;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Document(collection = "gross_profit")
public class GrossProfit {
    @Field("percent")
    @Size(max = 2)
    private Double percent;
    @Field("effective_date")
    @NotNull
    private Date effectiveDate;
    @Field("expired_date")
    private Date expiredDate;
    @Field("segments")
    private List<Segments> segments;

    public GrossProfit() {
    }

    public GrossProfit(Double percent, Date effectiveDate, Date expiredDate, List<Segments> segments) {
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

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public List<Segments> getSegments() {
        return segments;
    }

    public void setSegments(List<Segments> segments) {
        this.segments = segments;
    }
}
