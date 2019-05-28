package com.company.aviator.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * Справочник статей ВПО
 */
@Table(name = "AVIATOR_PLAN_ARTICLE")
@Entity(name = "aviator_PlanArticle")
public class PlanArticle extends BaseUuidEntity {
    @Column(name = "GUID")
    protected UUID guid;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    protected PlanArticle parent;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FINSOURCE_ID")
    protected Finsource finsource;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "FULLNAME")
    protected String fullname;

    public void setParent(PlanArticle parent) {
        this.parent = parent;
    }

    public PlanArticle getParent() {
        return parent;
    }

    public void setFinsource(Finsource finsource) {
        this.finsource = finsource;
    }

    public Finsource getFinsource() {
        return finsource;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }
}