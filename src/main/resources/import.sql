insert into attraction (attractionId, name, rating, review ) values (nextval('attraction_seq'), 'Palenque', 5, 'review of palenque');
insert into location (locationId, name, attractions_attractionId, review ) values (nextval('location_seq'), 'Mexico', 1, 'Mexico is a warmn country and Mexicans are a warm people.  The food is spicy and the Mayan trial will amaze you');


insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Belize', 5);
insert into location (locationId, name, attractions_attractionId, review ) values (nextval('location_seq'), 'Belize', 2, 'a review for  Belize');


insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Guatemala', 5);
insert into location (locationId, name, attractions_attractionId, review ) values (nextval('location_seq'), 'Guatemala', 3, 'a review for Guatemala');



insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Argentina', 5);
insert into location (locationId, name, attractions_attractionId, review ) values (nextval('location_seq'), 'Argentina', 4, ' a review for Argentina');



insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Guatemala', 5);
insert into location (locationId, name, attractions_attractionId, review ) values (nextval('location_seq'), 'Guatemala', 5, 'another reivew for Guatemala');



insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Uruguay', 5);
insert into location (locationId, name, attractions_attractionId, review ) values (nextval('location_seq'), 'Uruguay', 6, 'A review for Uruguay');


insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Chile', 5);
insert into location (locationId, name, attractions_attractionId, review ) values (nextval('location_seq'), 'Guatemala', 7, 'a revoew for Chile');


insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Easter Island', 5);
insert into location (locationId, name, attractions_attractionId, review ) values (nextval('location_seq'), 'Easter Island', 8, ' a review for Easter Island');