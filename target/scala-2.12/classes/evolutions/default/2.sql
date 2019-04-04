# --- Sample dataset

# --- !Ups

DELETE FROM USER;
DELETE FROM PRODUCT;
DELETE FROM CATEGORY;
DELETE FROM PLATFORM;
DELETE FROM DISCOUNT;

INSERT INTO USER VALUES('admin', 'admin@gmail.com', 'Hulk', 'Hogan','Merryway road 123','$2a$10$CxclgqyMzrYng..2r9XzLuzgcExg1H8xi4d6mgLf/NzJbeNj8uRbG', 'admin');
INSERT INTO USER VALUES('customer', 'ritadaria1@gmail.com', 'Rita', 'Daria','Somewhere over the rainbow road, 123 street, dublin','$2a$10$CxclgqyMzrYng..2r9XzLuzgcExg1H8xi4d6mgLf/NzJbeNj8uRbG', 'customer');

INSERT INTO DISCOUNT VALUES('null', 'lol', true, 1.0);
INSERT INTO DISCOUNT VALUES('BIGSAVINGS', 'Opening discount.', true, 1.0);

INSERT INTO PLATFORM VALUES (1, 'PlayStation 4');
INSERT INTO PLATFORM VALUES (2, 'Nintendo Switch');
INSERT INTO PLATFORM VALUES (3, 'Xbox One');
INSERT INTO PLATFORM VALUES (4, 'PC');

INSERT INTO CATEGORY VALUES (1, 'First-Person Shooter');
INSERT INTO CATEGORY VALUES (2, 'RPG');
INSERT INTO CATEGORY VALUES (3, 'Strategy');
INSERT INTO CATEGORY VALUES (4, 'Sports');
INSERT INTO CATEGORY VALUES (5, 'Action-Adventure');

INSERT INTO CATEGORY_PRODUCT VALUES (1, 1);
INSERT INTO CATEGORY_PRODUCT VALUES (2, 2);
INSERT INTO CATEGORY_PRODUCT VALUES (4, 4);
INSERT INTO CATEGORY_PRODUCT VALUES (3, 3);
INSERT INTO CATEGORY_PRODUCT VALUES (5, 5);

INSERT INTO PRODUCT VALUES (1, 3, 'Halo: The Master Chief Collection','For the first time ever, the Master Chief''s entire story is on one console. Featuring a re-mastered Halo 2: Anniversary, along with Halo: Combat Evolved Anniversary, Halo 3, Halo 4.', 50, 30.0, '343 Industries', 'Microsoft');
INSERT INTO PRODUCT VALUES (2, 1, 'Resident Evil 2','A deadly virus engulfs the residents of Raccoon City in September of 1998, plunging the city into chaos as flesh eating zombies roam the streets for survivors.', 20, 60.0, 'Capcom R&D Division 1', 'Capcom');
INSERT INTO PRODUCT VALUES (3, 2, 'Sid Meier''s Civilization VI' ,'Originally created by legendary game designer, Sid Meier, Civilization is a turn-based strategy game in which you build an empire to stand the test of time.', 5, 55.0, 'Firaxis Games', '2K');
INSERT INTO PRODUCT VALUES (4, 3, 'FIFA 19','	Powered by Frostbite™, EA SPORTS™ FIFA 19 delivers a champion-caliber experience on and off the pitch. Led by the prestigious UEFA Champions League, FIFA 19 offers enhanced gameplay features that allow you to control the pitch in every moment.', 0, 60.0, 'Electronic Arts', 'EA');
INSERT INTO PRODUCT VALUES (5, 4, 'Sekiro: Shadows Die Twice','Carve your own clever path to vengeance in an all-new adventure from developer From Software, creators of Bloodborne and the Dark Souls series.', 20, 60.0, 'From Software', 'Activision');
