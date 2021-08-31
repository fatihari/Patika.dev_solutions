/**
 *  @author Fatih ARI - 31.08.2021
 */
 
-- Option 1:
/*CREATE TABLE table_name
(
  column1_name data_type constraint
  column2_name data_type constraint
  column3_name data_type constraint
  ...
);*/

CREATE TABLE employee
(
  id SERIAL PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  birthday DATE,
  email VARCHAR(100) NOT NULL
);


-- Option 2:
/*INSERT INTO table_name (col1, col2, col3, ...)
  VALUES (col1_value, col2_value, col3_value, ...), */

insert into employee (name, email, birthday) values ('Pru', 'pciccoloi0@answers.com', '1997-01-26');
insert into employee (name, email, birthday) values ('Kip', 'krew1@cnn.com', '1995-02-24');
insert into employee (name, email, birthday) values ('Hermie', 'haidler2@chron.com', '1999-02-18');
insert into employee (name, email, birthday) values ('Shela', 'srhoddie3@weather.com', '1994-11-14');
insert into employee (name, email, birthday) values ('Mureil', 'mmanagh4@163.com', '1997-10-21');
insert into employee (name, email, birthday) values ('Heather', 'hcolqueran5@tmall.com', '1995-08-16');
insert into employee (name, email, birthday) values ('Fonzie', 'fdegiovanni6@hexun.com', '1995-07-27');
insert into employee (name, email, birthday) values ('Payton', 'pcawthorn7@hostgator.com', '1998-01-16');
insert into employee (name, email, birthday) values ('Christine', 'clapley8@pinterest.com', '1995-05-02');
insert into employee (name, email, birthday) values ('Nerissa', 'nalmey9@accuweather.com', '1996-01-18');
insert into employee (name, email, birthday) values ('Keefer', 'kwilgara@delicious.com', '1993-01-09');
insert into employee (name, email, birthday) values ('Heall', 'hculbardb@slate.com', '1990-12-08');
insert into employee (name, email, birthday) values ('Olly', 'orawlisonc@aboutads.info', null);
insert into employee (name, email, birthday) values ('Winston', 'wfarreild@salon.com', '1998-02-09');
insert into employee (name, email, birthday) values ('Jolynn', 'jdominike@cloudflare.com', '1992-09-09');
insert into employee (name, email, birthday) values ('Ingra', 'idreghornf@shinystat.com', '1993-10-15');
insert into employee (name, email, birthday) values ('Abbe', 'adinapolig@opera.com', '1990-11-17');
insert into employee (name, email, birthday) values ('Caressa', 'cbaldinih@spotify.com', '1998-10-25');
insert into employee (name, email, birthday) values ('Gnni', 'gtufti@wikipedia.org', '1991-11-22');
insert into employee (name, email, birthday) values ('Ernestus', 'ebrockwellj@sphinn.com', '1995-01-13');
insert into employee (name, email, birthday) values ('Essa', 'ecapelowk@who.int', '1991-03-17');
insert into employee (name, email, birthday) values ('Clerc', 'cstonebanksl@vkontakte.ru', '1993-02-10');
insert into employee (name, email, birthday) values ('Alisun', 'ablaikm@pbs.org', '1993-12-16');
insert into employee (name, email, birthday) values ('Em', 'ecadoren@simplemachines.org', '1997-06-19');
insert into employee (name, email, birthday) values ('Marlane', 'mclarkewilliamso@irs.gov', '1993-03-30');
insert into employee (name, email, birthday) values ('Alberta', 'awindrassp@discovery.com', null);
insert into employee (name, email, birthday) values ('Kiley', 'kjoinseyq@utexas.edu', '1998-03-25');
insert into employee (name, email, birthday) values ('Ramon', 'rcowelyr@buzzfeed.com', '1995-06-07');
insert into employee (name, email, birthday) values ('Ferne', 'fblockeys@lycos.com', '1992-07-31');
insert into employee (name, email, birthday) values ('Erwin', 'ehiggant@fema.gov', '1994-12-18');
insert into employee (name, email, birthday) values ('Lorraine', 'lgainfortu@macromedia.com', '2000-06-21');
insert into employee (name, email, birthday) values ('Rubina', 'rorpenv@house.gov', '1990-11-12');
insert into employee (name, email, birthday) values ('Frederich', 'ftaceyw@narod.ru', '1992-12-30');
insert into employee (name, email, birthday) values ('Roseanna', 'rfardox@senate.gov', '1994-02-14');
insert into employee (name, email, birthday) values ('Raff', 'rcuxsony@blogs.com', '1999-12-10');
insert into employee (name, email, birthday) values ('Gregory', 'gbrazearz@shutterfly.com', '1998-12-30');
insert into employee (name, email, birthday) values ('Becky', 'bclevely10@jalbum.net', '1991-02-15');
insert into employee (name, email, birthday) values ('Mignonne', 'mferrand11@dmoz.org', null);
insert into employee (name, email, birthday) values ('Marlo', 'mheaseman12@eventbrite.com', '1994-11-01');
insert into employee (name, email, birthday) values ('Prudence', 'pshevlan13@unesco.org', null);
insert into employee (name, email, birthday) values ('Johanna', 'jgierardi14@dyndns.org', '1997-05-18');
insert into employee (name, email, birthday) values ('Ashlen', 'ajevons15@amazonaws.com', '1993-04-13');
insert into employee (name, email, birthday) values ('Brianne', 'byegorov16@japanpost.jp', '1996-07-07');
insert into employee (name, email, birthday) values ('Smith', 'sdowdle17@ihg.com', '1995-07-05');
insert into employee (name, email, birthday) values ('Broderic', 'bgennerich18@cdbaby.com', null);
insert into employee (name, email, birthday) values ('Renato', 'rvose19@unblog.fr', '1994-07-11');
insert into employee (name, email, birthday) values ('Pip', 'papplewhaite1a@hao123.com', null);
insert into employee (name, email, birthday) values ('Hermon', 'hsturmey1b@home.pl', '1996-09-28');
insert into employee (name, email, birthday) values ('Wilhelm', 'wcowap1c@businessinsider.com', '1991-12-04');
insert into employee (name, email, birthday) values ('Ermanno', 'egarrison1d@va.gov', '1999-04-04');


-- Option 3:
/*
UPDATE table_name
SET column_name = value,
    column_name = value,
      ..
WHERE condition;
*/


-- First Update
UPDATE employee
SET name = 'Tarkan',
    birthday = '1976-12-30',
    email = 'kuzukuzu@tarkan.com'
WHERE id = 46;
-- RETURNING *;


-- Second Update
UPDATE employee
SET birthday = '1995-05-14',
    email = 'pip@env3.com'
WHERE name = 'Pip';
-- RETURNING *;


-- Third Update
UPDATE employee
SET name = 'Tolkien',
    email = 'hobbit@lotr.com'
WHERE birthday = '1996-09-28';
-- RETURNING *;


-- Fourth Update
UPDATE employee
SET name = 'Turgenyev',
    birthday = '1876-11-27',
    email = 'fathers@sons.com'
WHERE email = 'wcowap1c@businessinsider.com';
-- RETURNING *;


-- Fifth Update
UPDATE employee
SET id = 51,
    name = 'Dumas',
    birthday = '1789-09-21',
    email = 'monte@cristo.com'
WHERE id = 50;
-- RETURNING *;

-- Option 4:
/*
DELETE FROM table_name
WHERE condition;
*/


> -- First Delete
DELETE FROM employee
WHERE id = 51; --deleted id=51
-- RETURNING *;


-- Second Delete
DELETE FROM employee
WHERE id BETWEEN 40 AND 45; --deleted id=40,41,42,43,44,45
-- RETURNING *;


-- Third Delete
DELETE FROM employee
WHERE name 'Mignonne'; -- deleted id = 38;
-- RETURNING *;


-- Fourth Delete
DELETE FROM employee
WHERE id < 30; --deleted id < 30
-- RETURNING *;


-- Fifth Delete

DELETE FROM employee
WHERE birthday::text LIKE '200_%'; --casting date to text and deleted id=31
-- RETURNING *;
