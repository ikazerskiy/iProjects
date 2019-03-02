CREATE DATABASE projects;

CREATE USER projects_user IDENTIFIED BY 'projects_user';

USE projects;

GRANT ALL privileges on projects.* to 'projects_user'@'%';
