insert into Review (reviewId, reviewBody) values (nextval('review_seq'), 'Mexico is a warm country and Mexicans are a warm people, the food is spicy and the Mayan sites are to die for')
insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Palenque', 5);
insert into location (locationId, name, attractions_attractionId, reviews_reviewId ) values (nextval('location_seq'), 'Mexico', 1,1);


insert into Review (reviewId, reviewBody) values (nextval('review_seq'), 'Belize is really chill and great for snorkelling')
insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Belize', 5);
insert into location (locationId, name, attractions_attractionId, reviews_reviewId ) values (nextval('location_seq'), 'Belize', 2,2);


insert into Review (reviewId, reviewBody) values (nextval('review_seq'), 'Guatemala has great Mayan sites and an amazing food culture')
insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Guatemala', 5);
insert into location (locationId, name, attractions_attractionId, reviews_reviewId ) values (nextval('location_seq'), 'Guatemala', 3,3);



insert into Review (reviewId, reviewBody) values (nextval('review_seq'), 'Argentina offers tango and friendliness in abundance, vegans may struggle')
insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Argentina', 5);
insert into location (locationId, name, attractions_attractionId, reviews_reviewId ) values (nextval('location_seq'), 'Argentina', 4,4);



insert into Review (reviewId, reviewBody) values (nextval('review_seq'), 'Guatemala has great Mayan sites and an amazing food culture')
insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Guatemala', 5);
insert into location (locationId, name, attractions_attractionId, reviews_reviewId ) values (nextval('location_seq'), 'Guatemala', 5,5);



insert into Review (reviewId, reviewBody) values (nextval('review_seq'), 'Uruguay is small but packs in a lot')
insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Uruguay', 5);
insert into location (locationId, name, attractions_attractionId, reviews_reviewId ) values (nextval('location_seq'), 'Uruguay', 6,6);


insert into Review (reviewId, reviewBody) values (nextval('review_seq'), 'Chile has a long sprawling coastline and amazing cities too')
insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Chile', 5);
insert into location (locationId, name, attractions_attractionId, reviews_reviewId ) values (nextval('location_seq'), 'Guatemala', 7,7);


insert into Review (reviewId, reviewBody) values (nextval('review_seq'), 'Easter Island takes some getting too, but you will love the Rapa Nui')
insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Easter Island', 5);
insert into location (locationId, name, attractions_attractionId, reviews_reviewId ) values (nextval('location_seq'), 'Easter Island', 8,8);