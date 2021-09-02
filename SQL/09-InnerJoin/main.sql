/**
 *  @author Fatih ARI - 30.08.2021
 */
 
-- Option 1:
SELECT city, country FROM country INNER JOIN city
ON country.country_id = city.country_id;

-- Option 2:
SELECT payment_id, first_name, last_name FROM payment INNER JOIN customer
ON payment.customer_id = customer.customer_id;

-- Option 3:
SELECT rental.customer_id, first_name, last_name FROM rental INNER JOIN customer
ON rental.customer_id = customer.customer_id;
