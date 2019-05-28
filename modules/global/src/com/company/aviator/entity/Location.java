package com.company.aviator.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Справочник мест размещения (PLACE)
 */
@Table(name = "AVIATOR_LOCATION")
@Entity(name = "aviator_Location")
public class Location extends BaseUuidEntity {
    @NotNull
    @Column(name = "CODE", nullable = false, length = 32)
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