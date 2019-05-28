package com.company.aviator.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * Стадии согласования
 */
@Table(name = "AVIATOR_WORKFLOW")
@Entity(name = "aviator_Workflow")
public class Workflow extends BaseUuidEntity {
    @NotNull
    @Column(name = "GUID", nullable = false)
    protected UUID guid;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    protected Workflow parent;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "EQUAL_TO_PROCESS_STAGE_STATUS")
    protected String equalToProcessStageStatus;

    @Column(name = "CURRENT_STAGE")
    protected Integer currentStage;

    @Column(name = "NEW_STAGE")
    protected Integer newStage;

    public void setParent(Workflow parent) {
        this.parent = parent;
    }

    public Workflow getParent() {
        return parent;
    }

    public Integer getNewStage() {
        return newStage;
    }

    public void setNewStage(Integer newStage) {
        this.newStage = newStage;
    }

    public Integer getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(Integer currentStage) {
        this.currentStage = currentStage;
    }

    public String getEqualToProcessStageStatus() {
        return equalToProcessStageStatus;
    }

    public void setEqualToProcessStageStatus(String equalToProcessStageStatus) {
        this.equalToProcessStageStatus = equalToProcessStageStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }
}