create table AVIATOR_ACCOUNT (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    GUID uniqueidentifier,
    CODE varchar(32),
    NAME varchar(255),
    --
    primary key nonclustered (ID)
);