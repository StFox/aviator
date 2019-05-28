create table AVIATOR_WORKFLOW (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    GUID uniqueidentifier not null,
    PARENT uniqueidentifier,
    DESCRIPTION varchar(255),
    EQUAL_TO_PROCESS_STAGE_STATUS varchar(255),
    CURRENT_STAGE integer,
    NEW_STAGE integer,
    --
    primary key nonclustered (ID)
);