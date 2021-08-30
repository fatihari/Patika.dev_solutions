/**
 *  @author Fatih ARI - 30.08.2021
 */
 
-- Option 1:
-- AVG(column) = the average of the values in the column. 
SELECT ROUND(AVG(rental_rate), 2) FROM film;    -- ROUND(value, 2) = shows 2 digits. 


-- Option 2:
SELECT COUNT(*) FROM film   -- COUNT(*) = ROW COUNT
WHERE title LIKE 'C%';


-- Option 3:
-- MAX(column) = maximum value in column.
SELECT MAX(length) FROM film
WHERE rental_rate = 0.99;

-- Option 4:
-- DISTINCT(column_name) = columns with different values 
SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150;
