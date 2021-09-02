/**
 *  @author Fatih ARI - 02.09.2021
 */
 
-- Option 1:
SELECT city.city, country.country FROM city LEFT JOIN country --  first table is important in LEFTJoin
ON country.country_id = city.country_id;


-- Option 2:
SELECT payment.payment_id, customer.first_name, customer.last_name FROM customer RIGHT JOIN payment -- second table is important in Right Join
ON payment.customer_id = customer.customer_id;

-- Option 3:
SELECT rental_id, first_name, last_name FROM customer FULL JOIN rental
ON customer.customer_id = rental.customer_id;
