/**
 *  @author Fatih ARI - 03.09.2021
 */
 
-- Option 1:
SELECT COUNT(*) FROM film
WHERE length > 
(
SELECT AVG(length) FROM film
);

-- Option 2:
SELECT COUNT(*) FROM film
WHERE rental_rate = ANY -- it can be ALL
(
SELECT MAX(rental_rate) from film
);


-- Option 3:
SELECT title, replacement_cost, rental_rate  FROM film
WHERE replacement_cost = ANY -- it can be empty or ALL
(
    SELECT MIN(replacement_cost) FROM film
)
AND rental_rate = ANY -- it can be empty or ALL
(
    SELECT MIN(rental_rate) FROM film
);

-- Option 4:
SELECT first_name, last_name, customer.customer_id, amount FROM customer INNER JOIN payment
ON customer.customer_id = payment.customer_id
WHERE amount = ALL
(
   SELECT MAX(amount) FROM payment
);
