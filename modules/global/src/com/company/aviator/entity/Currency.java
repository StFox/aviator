package com.company.aviator.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Справочник валют
 */
@Table(name = "AVIATOR_CURRENCY")
@Entity(name = "aviator_Currency")
public class Currency extends BaseUuidEntity {
    @NotNull
    @Column(name = "CODE", nullable = false, length = 3)
    protected String code;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}