
create table albums(
id bigint(15) not null auto_increment,
name varchar(100) not null,
genre varchar(30),
release_date datetime,
image_url varchar(100),
artist_id bigint(15) not null ,
primary key (id),
foreign key (artist_id) references artists(id)
);

alter table albums add column created_at date not null;