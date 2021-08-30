/**
 *  @author Fatih ARI - 30.08.2021
 */
 
-- Option 1:
SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length DESC -- sort_expression1 [ASC | DESC], ... sort_expressionN [ASC | DESC],
LIMIT 5; -- LIMIT row_count

-- Option 2:
SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length ASC -- sort_expression1 [ASC | DESC], ... sort_expressionN [ASC | DESC]
LIMIT 5 OFFSET 5*1; -- LIMIT row_count OFFSET row_to_skip

-- Option 3:
SELECT * FROM customer
WHERE store_id = 1
ORDER BY last_name DESC -- sort_expression1 [ASC | DESC], ... sort_expressionN [ASC | DESC]
LIMIT 4; -- LIMIT row_count
