insert into location (locationId, name, review ) values (nextval('location_seq'), 'Mexico',  'Mexico is a warmn country and Mexicans are a warm people.  The food is spicy and the Mayan trial will amaze you');
insert into attraction (attractionId, locationId, name, rating, review ) values (nextval('attraction_seq'), 1, 'Palenque', 5, 'review of palenque');
insert into attraction (attractionId, locationId, name, rating, review ) values (nextval('attraction_seq'), 1, 'Playa del Carmen', 3, 'Playa del Carmen');

insert into location (locationId, name, review ) values (nextval('location_seq'), 'Belize',  'Belize has some amazing sport for snorkelling and diving, the seafood is amazing too');
insert into attraction (attractionId, locationId, name, rating, review ) values (nextval('attraction_seq'), 2, 'Caye Caulker', 5, 'review of caye caulker');
insert into attraction (attractionId, locationId, name, rating, review ) values (nextval('attraction_seq'), 2, 'Belize City', 2, 'Only passed through on the way to the islands, looked a bit run down and seedy');

