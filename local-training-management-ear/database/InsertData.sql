-- Data
insert into course_type (id, name) values (1, 'T�cnico');
insert into course_type (id, name) values (2, 'Carrera');
insert into course_type (id, name) values (3, 'P�ldora');
insert into course_type (id, name) values (4, 'Negocio');
insert into course_type (id, name) values (5, 'People');
insert into course_type (id, name) values (6, 'Centros');

insert into courses_managers (id, name) values (1, 'Universidad corporativa');
insert into courses_managers (id, name) values (2, 'Centro');

insert into center (id, name) values (1, 'Murcia');
insert into center (id, name) values (2, 'Alicante');

insert into employee_profiles (id, name) values (1, 'CT');
insert into employee_profiles (id, name) values (2, 'CA');
insert into employee_profiles (id, name) values (3, 'CAL');
insert into employee_profiles (id, name) values (4, 'CCL');
insert into employee_profiles (id, name) values (5, 'CLL');
insert into employee_profiles (id, name) values (6, 'CE');
insert into employee_profiles (id, name) values (7, 'Manager');
insert into employee_profiles (id, name) values (8, 'Soporte Administrativo');
insert into employee_profiles (id, name) values (9, 'T�cnico de Sistemas');

insert into call_statuses (id, name) values (1, 'PLANNED');
insert into call_statuses (id, name) values (2, 'CONFIRMED');
insert into call_statuses (id, name) values (3, 'FINISHED');
insert into call_statuses (id, name) values (4, 'CANCELLED');

insert into inscription_status (id, name) values (1, 'PLANNED');
insert into inscription_status (id, name) values (2, 'CONFIRMED');
insert into inscription_status (id, name) values (3, 'CANCELLED');


INSERT INTO COURSE_TYPES (COURSE_TYPE_ID, COURSE_TYPE_DESCRIPTION) VALUES (1, 'CARRERA');
INSERT INTO COURSE_TYPES (COURSE_TYPE_ID, COURSE_TYPE_DESCRIPTION) VALUES (2, 'NEGOCIO');
INSERT INTO COURSE_TYPES (COURSE_TYPE_ID, COURSE_TYPE_DESCRIPTION) VALUES (3, 'TECNICO');

INSERT INTO EMPLOYEE_PROFILES (PROFILE_ID, PROFILE_DESCRIPTION) VALUES (1, 'CT');
INSERT INTO EMPLOYEE_PROFILES (PROFILE_ID, PROFILE_DESCRIPTION) VALUES (2, 'CA');
INSERT INTO EMPLOYEE_PROFILES (PROFILE_ID, PROFILE_DESCRIPTION) VALUES (3, 'CAL');
INSERT INTO EMPLOYEE_PROFILES (PROFILE_ID, PROFILE_DESCRIPTION) VALUES (4, 'CCL');
INSERT INTO EMPLOYEE_PROFILES (PROFILE_ID, PROFILE_DESCRIPTION) VALUES (5, 'CLL');
INSERT INTO EMPLOYEE_PROFILES (PROFILE_ID, PROFILE_DESCRIPTION) VALUES (6, 'CE');

INSERT INTO COURSES_MANAGERS (MANAGER_ID, MANGER_NAME) VALUES (1, 'Univ Coorporativa');

INSERT INTO COURSES (COURSE_ID, DESCRIPTION, COURSE_TYPE_ID, MANAGER_ID) VALUES (1, 'Java Basic', 3, 1);
INSERT INTO COURSES (COURSE_ID, DESCRIPTION, COURSE_TYPE_ID, MANAGER_ID) VALUES (2, 'Java Advance', 3, 1);
INSERT INTO COURSES (COURSE_ID, DESCRIPTION, COURSE_TYPE_ID, MANAGER_ID) VALUES (3, 'SQL', 3, 1);
INSERT INTO COURSES (COURSE_ID, DESCRIPTION, COURSE_TYPE_ID, MANAGER_ID) VALUES (4, 'PL/SQL', 3, 1);
INSERT INTO COURSES (COURSE_ID, DESCRIPTION, COURSE_TYPE_ID, MANAGER_ID) VALUES (5, 'Team Management', 1, 1);
INSERT INTO COURSES (COURSE_ID, DESCRIPTION, COURSE_TYPE_ID, MANAGER_ID) VALUES (6, 'Team Leadership', 1, 1);
INSERT INTO COURSES (COURSE_ID, DESCRIPTION, COURSE_TYPE_ID, MANAGER_ID) VALUES (7, 'Fenix', 1, 1);
INSERT INTO COURSES (COURSE_ID, DESCRIPTION, COURSE_TYPE_ID, MANAGER_ID) VALUES (8, 'Darwin', null, 1);

INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (1, 1);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (2, 1);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (2, 2);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (2, 3);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (3, 1);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (3, 2);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (4, 2);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (4, 3);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (5, 2);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (5, 3);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (5, 4);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (6, 2);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (6, 3);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (5, 5);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (5, 6);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (7, 1);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (7, 2);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (7, 3);
INSERT INTO PROFILES_OF_COURSE (COURSE_ID, PROFILE_ID) VALUES (7, 4);

INSERT INTO DEPARTAMENT_TYPES (ID, NAME) VALUES (1, 'CENTRO');
INSERT INTO DEPARTAMENT_TYPES (ID, NAME) VALUES (2, 'LINEA');
INSERT INTO DEPARTAMENT_TYPES (ID, NAME) VALUES (3, 'CELDA');

INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (1, 1, 'Murcia', NULL, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (2, 2, 'Business Intelligence', 1, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (3, 2, 'Java', 1, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (4, 2, 'SAP', 1, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (5, 3, 'Celda1', 2, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (6, 3, 'Celda2', 2, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (7, 3, 'Celda3', 2, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (8, 3, 'Celda4', 3, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (9, 3, 'Celda5', 3, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (10, 3, 'Celda6', 3, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (11, 3, 'Celda7', 4, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (12, 3, 'Celda8', 4, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (13, 3, 'Celda9', 4, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (14, 3, 'Celda10', 2, NULL);
INSERT INTO DEPARTAMENTS (ID, DEPARTAMENT_TYPE_ID, NAME, FATHER_DEPARTAMENT_ID, MANAGER_ID) VALUES (15, 3, 'Celda11', 2, NULL);

INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (1, 100, 'Jose Antonio', 'Bermudez', 'jab@everis.com', SYSDATE, 6, 1);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (2, 101, 'Angel', 'Jimenez', 'jab@everis.com', SYSDATE, 5, 2);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (3, 102, 'Andres', 'Segado', 'jab@everis.com', SYSDATE, 5, 3);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (4, 103, 'Maria Angeles', 'Sanchez', 'jab@everis.com', SYSDATE, 5, 4);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (5, 104, 'Jose ', 'Cano', 'jab@everis.com', SYSDATE, 4, 5);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (6, 105, 'Andres', 'Bermudez', 'jab@everis.com', SYSDATE, 4, 6);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (7, 106, 'Angel', 'Bermudez', 'jab@everis.com', SYSDATE, 3, 6);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (8, 107, 'Antonio', 'Sanchez', 'jab@everis.com', SYSDATE, 4, 7);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (9, 108, 'Jose Antonio', 'Martinez', 'jab@everis.com', SYSDATE, 3, 7);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (10, 109, 'Jorge', 'Cano', 'jab@everis.com', SYSDATE, 2, 7);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (11, 110, 'Mariano', 'Roch', 'jab@everis.com', SYSDATE, 4, 8);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (12, 111, 'Eddy', 'Bermudez', 'jab@everis.com', SYSDATE, 4, 9);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (13, 112, 'Antonio', 'Cuadrat', 'jab@everis.com', SYSDATE, 4, 10);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (14, 113, 'Marta', 'del Barrio', 'jab@everis.com', SYSDATE, 3, 10);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (15, 114, 'Angeles', 'Bermudez', 'jab@everis.com', SYSDATE, 4, 11);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (16, 115, 'Marisa', 'Gomez', 'jab@everis.com', SYSDATE, 3, 11);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (17, 116, 'Roberto', 'Sanchez', 'jab@everis.com', SYSDATE, 2, 11);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (18, 117, 'Laura', 'Gil', 'jab@everis.com', SYSDATE, 4, 12);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (19, 118, 'Andrea', 'Rodriguez', 'jab@everis.com', SYSDATE, 4, 13);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (20, 119, 'Maria', 'Romero', 'jab@everis.com', SYSDATE, 4, 14);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (21, 120, 'Julia', 'Exposito', 'jab@everis.com', SYSDATE, 4, 15);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (22, 121, 'Isa', 'Rico', 'jab@everis.com', SYSDATE, 3, 15);

INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (23, 122, 'Jesus', 'Madrid', 'jab@everis.com', SYSDATE, null, 1);
INSERT INTO EMPLOYEES (ID, EMPLOYEE_NUMBER, NAME, SURNAME, EMAIL, INCORPORATION_DATE, PROFILE_ID, DEPARTAMENT_ID) VALUES (24, 123, 'Teresa', 'Tripliana', 'jab@everis.com', SYSDATE, null, 1);

INSERT INTO CENTROS (ID, RESPONSABLE_FORMACION_ID, RESPONSABLE_OCU_ID) VALUES (1, 24, 23);

UPDATE DEPARTAMENTS SET MANAGER_ID = 1   WHERE ID = 1 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 2   WHERE ID = 2 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 3   WHERE ID = 3 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 4   WHERE ID = 4 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 5   WHERE ID = 5 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 6   WHERE ID = 6 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 8   WHERE ID = 7 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 11  WHERE ID = 8  ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 12  WHERE ID = 9  ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 13  WHERE ID = 10 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 15  WHERE ID = 11 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 18  WHERE ID = 12 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 19  WHERE ID = 13 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 20  WHERE ID = 14 ;
UPDATE DEPARTAMENTS SET MANAGER_ID = 21  WHERE ID = 15 ;

commit;
