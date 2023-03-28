use apt;
create table if not exists user
(
    id varchar(30) not null,
    pw varchar(30) not null
);
INSERT INTO apt.user (id, pw) VALUES ('admin', '1234');
INSERT INTO apt.user (id, pw) VALUES ('guest', '1234');