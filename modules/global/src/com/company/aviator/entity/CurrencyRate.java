package com.company.aviator.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Справочник курсов валют, включая прогнозный курс
 */
@Table(name = "AVIATOR_CURRENCY_RATE")
@Entity(name = "aviator_CurrencyRate")
public class CurrencyRate extends BaseUuidEntity {
    @NotNull
    @Column(name = "CODE", nullable = false, length = 3)
    protected String code;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE", nullable = false)
    protected Date date;

    @NotNull
    @Column(name = "RATE", nullable = false)
    protected Double rate;

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}