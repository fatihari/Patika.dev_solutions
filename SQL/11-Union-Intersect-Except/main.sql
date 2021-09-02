/**
 *  @author Fatih ARI - 02.09.2021
 */
 
-- Option 1:
(
SELECT first_name FROM actor
)
UNION -- "UNION ALL" is used to display both intersections.
(
SELECT first_name FROM customer
);

-- Option 2:
(
SELECT first_name FROM actor
)
INTERSECT
(
SELECT first_name FROM customer
);

-- Option 3:
(
SELECT first_name FROM actor
)
EXCEPT
(
SELECT first_name FROM customer
);

-- Option 4:
(
SELECT first_name FROM actor
)
UNION ALL
(
SELECT first_name FROM customer
);
