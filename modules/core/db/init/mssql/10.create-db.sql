-- begin AVIATOR_ACCOUNT
create table AVIATOR_ACCOUNT (
    ID uniqueidentifier,
    --
    GUID uniqueidentifier,
    CODE varchar(32),
    NAME varchar(255),
    --
    primary key nonclustered (ID)
)^
-- end AVIATOR_ACCOUNT
-- begin AVIATOR_WORKFLOW
create table AVIATOR_WORKFLOW (
    ID uniqueidentifier,
    --
    GUID uniqueidentifier not null,
    PARENT uniqueidentifier,
    DESCRIPTION varchar(255),
    EQUAL_TO_PROCESS_STAGE_STATUS varchar(255),
    CURRENT_STAGE integer,
    NEW_STAGE integer,
    --
    primary key nonclustered (ID)
)^
-- end AVIATOR_WORKFLOW
