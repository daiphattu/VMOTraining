package com.training.vmo.dto;

import com.training.vmo.entity.Segments;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.ZonedDateTime;
import java.util.List;

public class GrossProfitDTO {

    private Double percent;

    private ZonedDateTime effectiveDate;

    private ZonedDateTime expiredDate;

    private List<Segments> segments;

    public GrossProfitDTO() {
    }

    public GrossProfitDTO(Double percent, ZonedDateTime effectiveDate, ZonedDateTime expiredDate, List<Segments> segments) {
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

    public List<Segments> getSegments() {
        return segments;
    }

    public void setSegments(List<Segments> segments) {
        this.segments = segments;
    }
}
