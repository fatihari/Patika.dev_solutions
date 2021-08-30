# 05-OrderBy-Limit-Offset

>1- Select the 5 longest (length) movies in the 'film' table and the movie title (title) ends with the 'n' character.
>``` SQL
> SELECT * FROM film
> WHERE title LIKE '%n'
> ORDER BY length DESC -- sort_expression1 [ASC | DESC], ... sort_expressionN [ASC | DESC],
> LIMIT 5; -- LIMIT row_count
>```
> ![image](https://user-images.githubusercontent.com/57245919/131367213-18aaa29c-b8c0-457c-9ca5-b03dd23ba63e.png)
>
>
>2- In the title column of the "film" table, select the ***second*** 5 shortest (length) movies ending with the 'n character.
>``` SQL
> SELECT * FROM film
> WHERE title LIKE '%n'
> ORDER BY length ASC -- sort_expression1 [ASC | DESC], ... sort_expressionN [ASC | DESC]
> LIMIT 5 OFFSET 5*1; -- LIMIT row_count OFFSET row_to_skip
>```
>
> ![image](https://user-images.githubusercontent.com/57245919/131368325-22cc7339-2823-4379-8e5f-8bf341c3a8b8.png)
>
>
>3- In the descending order according to the last_name column in the 'customer' table, sort the first 4 data provided that the store_id is 1. 
>``` SQL
> SELECT * FROM customer
> WHERE store_id = 1
> ORDER BY last_name DESC -- sort_expression1 [ASC | DESC], ... sort_expressionN [ASC | DESC]
> LIMIT 4; -- LIMIT row_count
>```
> ![image](https://user-images.githubusercontent.com/57245919/131369038-208c8001-9ef2-41a2-aeac-3675d9d94489.png)
>
>
