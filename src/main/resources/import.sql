insert into Review (reviewId, reviewBody) values (nextval('review_seq'), 'Mexico is a warm country and Mexicans are a warm people, the food is spicy and the Mayan sites are to die for')
insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Palenque', 5);
insert into location (locationId, name, attractions_attractionId, reviews_reviewId ) values (nextval('location_seq'), 'Mexico', 1,1);


insert into Review (reviewId, reviewBody) values (nextval('review_seq'), 'Belize is really chill and great for snorkelling')
insert into attraction (attractionId, name, rating) values (nextval('attraction_seq'), 'Belize', 5);
insert into location (locationId, name, attractions_attractionId, reviews_reviewId ) values (nextval('location_seq'), 'Mexico', 2,2);