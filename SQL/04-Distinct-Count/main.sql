/**
 *  @author Fatih ARI - 30.08.2021
 */
 
-- Option 1:
SELECT DISTINCT replacement_cost FROM film;

-- Option 2:
SELECT COUNT(DISTINCT replacement_cost) FROM film;

-- Option 3:
SELECT COUNT(*) FROM film
WHERE title LIKE 'T%' AND rating = 'G';

-- Option 4:
SELECT COUNT(*) FROM country
WHERE country LIKE '_____';

-- Option 5:
SELECT COUNT(*) FROM city
WHERE city ILIKE '%r'; -- ILIKE is case insensitive LIKE. 
