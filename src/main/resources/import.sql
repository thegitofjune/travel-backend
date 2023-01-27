insert into location (locationId, name, review ) values (nextval('location_seq'), 'Mexico',  'Mexico is a warmn country and Mexicans are a warm people.  The food is spicy and the Mayan trial will amaze you');
insert into attraction (attractionId, locationId, name, rating, review ) values (nextval('attraction_seq'), 1, 'Palenque', 5, 'review of palenque');
insert into attraction (attractionId, locationId, name, rating, review ) values (nextval('attraction_seq'), 1, 'Playa del Carmen', 3, 'Playa del Carmen');

