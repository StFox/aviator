package com.company.aviator.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

/**
 * Справочник кодов управленческого учета
 */
@Table(name = "AVIATOR_ACCOUNT")
@Entity(name = "aviator_Account")
public class Account extends BaseUuidEntity {
    @Column(name = "GUID")
    protected UUID guid;

    @Column(name = "CODE", length = 32)
    protected String code;

    @Column(name = "NAME")
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

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }
}