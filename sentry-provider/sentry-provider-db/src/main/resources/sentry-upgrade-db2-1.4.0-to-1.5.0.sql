-- SENTRY-327
ALTER TABLE SENTRY_DB_PRIVILEGE ADD WITH_GRANT_OPTION CHAR(1) NOT NULL;

-- SENTRY-339
DROP INDEX SENTRYPRIVILEGENAME;
CREATE UNIQUE INDEX SENTRYPRIVILEGENAME ON SENTRY_DB_PRIVILEGE ("SERVER_NAME",DB_NAME,"TABLE_NAME",URI,"ACTION",WITH_GRANT_OPTION);
ALTER TABLE SENTRY_DB_PRIVILEGE DROP PRIVILEGE_NAME;

-- Version update
UPDATE SENTRY_VERSION SET SCHEMA_VERSION='1.5.0', VERSION_COMMENT='Sentry release version 1.5.0' WHERE VER_ID=1;
