/**
 *  @author Fatih ARI - 30.08.2021
 */
 
-- Option 1:
SELECT country FROM country
WHERE country LIKE 'A%a';

-- Option 2:
SELECT country FROM country
WHERE country LIKE '_%_%_%_%_%n';

-- Option 3:
SELECT title FROM film
WHERE title ILIKE '%t%t%t%t%';

-- Option 4:
SELECT * FROM film
WHERE title LIKE 'C%' AND length >= 90 AND rental_rate = 2.99; 


