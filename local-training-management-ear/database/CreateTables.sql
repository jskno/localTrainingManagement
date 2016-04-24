CREATE TABLE user_role
(
  id smallint NOT NULL,
  name character varying(100) NOT NULL,
  CONSTRAINT user_role_pkey PRIMARY KEY (id)
);

CREATE TABLE inscription_status
(
  id smallint NOT NULL,
  name character varying(100) NOT NULL,
  CONSTRAINT inscription_status_pkey PRIMARY KEY (id)
);

CREATE TABLE call_statuses
(
  id smallint NOT NULL,
  name character varying(100) NOT NULL,
  CONSTRAINT call_statuses_pkey PRIMARY KEY (id)
);

CREATE TABLE calls
(
  id bigint NOT NULL,
  class_room_cost numeric(38,0),
  end_date timestamp without time zone,
  inidate timestamp without time zone,
  has_break boolean NOT NULL,
  has_documentation boolean NOT NULL,
  has_food boolean NOT NULL,
  observations character varying(255),
  professor_cost numeric(38,0),
  real_end_date timestamp without time zone,
  real_inidate timestamp without time zone,
  course_id bigint NOT NULL,
  call_status_id smallint,
  call_center_id smallint NOT NULL,
  removed_date timestamp without time zone,
  CONSTRAINT calls_pkey PRIMARY KEY (id)
);

CREATE TABLE courses_managers
(
  id integer NOT NULL,
  name character varying(100) NOT NULL,
  CONSTRAINT courses_managers_pkey PRIMARY KEY (id)
);

CREATE TABLE center
(
  id smallint NOT NULL,
  name character varying(100) NOT NULL,
  CONSTRAINT center_pkey PRIMARY KEY (id)
);

CREATE TABLE course_status
(
  id smallint NOT NULL,
  name character varying(100) NOT NULL,
  CONSTRAINT course_status_pkey PRIMARY KEY (id)
);

CREATE TABLE course_type
(
  id smallint NOT NULL,
  name character varying(100) NOT NULL,
  CONSTRAINT course_type_pkey PRIMARY KEY (id)
);

CREATE TABLE courses
(
  id bigint NOT NULL,
  description character varying(255) NOT NULL,
  has_syllabus boolean NOT NULL,
  manager_id integer,
  type_id smallint NOT NULL,
  removed_date timestamp without time zone,
  CONSTRAINT courses_pkey PRIMARY KEY (id),
  CONSTRAINT fk_courses_managers_id FOREIGN KEY (manager_id)
      REFERENCES courses_managers (id) ,
  CONSTRAINT fk_courses_type_id FOREIGN KEY (type_id)
      REFERENCES course_type (id)
);

CREATE TABLE employee_profiles
(
  id smallint NOT NULL,
  name character varying(100) NOT NULL,
  CONSTRAINT employee_profiles_pkey PRIMARY KEY (id)
);

CREATE TABLE employees
(
  id bigint NOT NULL,
  email character varying(255),
  employee_id character varying(30) NOT NULL,
  incorporation_date timestamp without time zone NOT NULL,
  name character varying(50) NOT NULL,
  surname character varying(150) NOT NULL,
  profile_id smallint,
  CONSTRAINT employees_pkey PRIMARY KEY (id)
);

CREATE TABLE courses_employee_profiles
(
  course_id bigint NOT NULL,
  employee_profile_id smallint NOT NULL,
  CONSTRAINT courses_employee_profiles_pkey PRIMARY KEY (course_id, employee_profile_id),
  CONSTRAINT fk_courses_employee_profiles_course_id FOREIGN KEY (course_id)
      REFERENCES courses (id),
  CONSTRAINT fk_courses_employee_profiles_employee_profile_id FOREIGN KEY (employee_profile_id)
      REFERENCES employee_profiles (id)
);

CREATE TABLE inscriptions
(
  call_id bigint NOT NULL,
  employee_id bigint NOT NULL,
  status_id smallint,
  CONSTRAINT inscription_pkey PRIMARY KEY (call_id, employee_id),
  CONSTRAINT fk_calls_id FOREIGN KEY (call_id)
      REFERENCES calls (id),
  CONSTRAINT fk_employees_id FOREIGN KEY (employee_id)
      REFERENCES employees (id),
  CONSTRAINT fk_inscription_status_id FOREIGN KEY (status_id)
      REFERENCES inscription_status (id)
);

-- Sequences
create sequence SEQ_COURSES;
create sequence SEQ_COURSECALLS;
