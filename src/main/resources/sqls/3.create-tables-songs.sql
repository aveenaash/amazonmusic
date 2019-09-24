create table songs(
id bigint(15) not null auto_increment,
title varchar(100) not null,
duration int(10),
release_date date,
album_id bigint(15) not null,
primary key (id),
foreign key (album_id) references albums(id));