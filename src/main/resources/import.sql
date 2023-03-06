insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Mexico',  'Mexico is a warm country and Mexicans are a warm people.  The food is spicy and the Mayan trial will amaze you', 5, 'AMERICAS');
insert into attraction (attractionId, locationId, name, rating, review ) values (nextval('attraction_seq'), 1, 'Palenque', 5, 'review of palenque');
insert into attraction (attractionId, locationId, name, rating, review ) values (nextval('attraction_seq'), 1, 'Playa del Carmen', 3, 'Playa del Carmen');

insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Belize',  'Belize has some amazing sport for snorkelling and diving, the seafood is amazing too', 5, 'AMERICAS');
insert into attraction (attractionId, locationId, name, rating, review ) values (nextval('attraction_seq'), 2, 'Caye Caulker', 5, 'review of caye caulker');
insert into attraction (attractionId, locationId, name, rating, review ) values (nextval('attraction_seq'), 2, 'Belize City', 2, 'Only passed through on the way to the islands, looked a bit run down and seedy');

insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Guatemala',  'Great for the Inka trail and some beautiful nature', 5), 'AMERICAS';
insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Argentina',  'Such a huge country and I only got to see a little, the people are great and you can learn to tango. Bit heavy on the meat diet though', 5, 'AMERICAS');
insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Peru',  'Lima is great for dance and good, then there''s Macchu Picchu of course, well worth the effort', 5), 'AMERICAS';
insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Chile',  'Only got to see the capital here, which is great, lots of dancing, return visit needed, ', 5, 'APAC');
insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Easter Island',  'A Once in a lifetime trip, takes a fair bit of effort to get here but this unique place and the Rapa Nui are well worth the effort', 5, 'AMERICAS');
insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Uruguay',  'A small country, more stable than most in south america', 3), 'AMERICAS';
insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'French Polynesia',  'Stunning nature, great snorkelling, eye watering prices', 5), 'APAC';
insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Australia',  'Friendly people, lively cities and learning to scuba dive on the great barrier reef made this really special', 5, 'APAC');
insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'New Zealand',  'Went here during the rugby world cup, lots of places fully booked but loved what I did see, nice people', 5, 'APAC');
insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Hong Kong',  'Although in the heart of Asia, east meets west in Hong Kong, this is one of my favourite places', 5, 'APAC');
insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Thailand',  'Good food, nice beaches, great snorkelling and diving.  Smile everywhere and moore temples than you can imagine', 5, 'APAC');
insert into location (locationId, name, review, rating, region ) values (nextval('location_seq'), 'Cambodia',  'Some truly unspoilt beaches, great food and Angkor Wat, of course', 5, 'APAC');
