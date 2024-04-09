CREATE TABLE client (
       id bigint NOT NULL,
       fio character varying(255),
       phone character varying(255),
       address character varying(255)
);

insert into client values ( 1, 'fio', 'phone1', 'addresss');

CREATE table Chief_Dish(
    chief_id int REFERENCES Chief(id),
    dish_id int REFERENCES  Dish(id),
    PRIMARY KEY (chief_id,dish_id)
);
