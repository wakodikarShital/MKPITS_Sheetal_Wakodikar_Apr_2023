-- --------Having Assignment---------
use sakila
show tables

-- 3. Popular languages:
-- List languages with more than 50 films.

select language.language_id, count(film_id) as languages from film join language on
film.language_id = language.language_id group by language_id having languages > 50

-- list languages with more than 50 films with their title and language
select language.language_id,title,name, count(film_id) as languages from film join language on
film.language_id = language.language_id group by language_id having languages > 50






