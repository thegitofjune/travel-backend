insert into attraction (attractionId, name, rating, review ) values (nextval('attraction_seq'), 'Palenque', 5, 'review of palenque');
insert into attraction (attractionId, name, rating, review ) values (nextval('attraction_seq'), 'Playa del Carmen', 3, 'Playa del Carmen');
insert into location (locationId, name, review ) values (nextval('location_seq'), 'Mexico',  'Mexico is a warmn country and Mexicans are a warm people.  The food is spicy and the Mayan trial will amaze you');
insert into Location_attractions( Location_locationId,  attractions_attractionId) values (1,1);
insert into Location_attractions( Location_locationId,  attractions_attractionId) values (1,2);


insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Belize', 5);
insert into location (locationId, name, review ) values (nextval('location_seq'), 'Belize', 'a review for  Belize');
 
insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Guatemala', 5);
insert into location (locationId, name, review ) values (nextval('location_seq'), 'Guatemala', 'a review for Guatemala');



insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Argentina', 5);
insert into location (locationId, name, review ) values (nextval('location_seq'), 'Argentina', ' a review for Argentina');



insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Guatemala', 5);
insert into location (locationId, name,  review ) values (nextval('location_seq'), 'Guatemala',  'another reivew for Guatemala');



insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Uruguay', 5);
insert into location (locationId, name,  review ) values (nextval('location_seq'), 'Uruguay',  'A review for Uruguay');


insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Chile', 5);
insert into location (locationId, name,  review ) values (nextval('location_seq'), 'Guatemala',  'a revoew for Chile');


insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Easter Island', 5);
insert into location (locationId, name,  review ) values (nextval('location_seq'), 'Easter Island',  ' a review for Easter Island');