create schema amazon_music_db;

create table artists(
id bigint(15) not null auto_increment,
name varchar(100) not null,
genre varchar(30),
country varchar(30),
primary key (id));