/**
 *  @author Fatih ARI - 30.08.2021
 */
 
-- Option 1:
SELECT rating, COUNT(*) FROM film --How many of each "rating" are there?  => COUNT(rating_i) = COUNT(*)
GROUP BY rating; 

-- Option 2:
SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50; -- Group Condition, very similar to 'WHERE'

-- Option 3:
SELECT store_id, COUNT(*) FROM customer
GROUP BY store_id;

-- Option 4:
SELECT country_id, COUNT(*) FROM city
GROUP BY country_id
ORDER BY COUNT(*) DESC
LIMIT 1;
