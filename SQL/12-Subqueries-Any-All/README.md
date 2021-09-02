# 12-Subqueries-Any-All

>1- In **film** table, the movie length is shown in the **length** column. How many movies are longer than the average movie length?
>``` SQL
> SELECT COUNT(*) FROM film
> WHERE length > 
> (
> SELECT AVG(length) FROM film
> );
>```
> ![image](https://user-images.githubusercontent.com/57245919/131914059-007ca922-778c-44f9-81e6-5802c180d4ee.png)
>
>2- How many movies have the highest **rental_rate** in **film** table?
>``` SQL
>
> SELECT COUNT(*) FROM film
> WHERE rental_rate = ANY -- it can be ALL
> (
> SELECT MAX(rental_rate) from film
> )
>```
> ![image](https://user-images.githubusercontent.com/57245919/131914715-f80fff1f-8824-46f0-a6de-0ff93356c359.png)
>
>3- In the movie table, select the movies with the lowest rental_rate and the lowest replacement_cost values.
> ``` SQL
>
> (
> SELECT first_name FROM actor
> )
> EXCEPT
> (
> SELECT first_name FROM customer
> );
>```
> ![image](https://user-images.githubusercontent.com/57245919/131896710-4737e2d9-e884-4578-af7d-0198b0748154.png)
>
>4- Let's do the first query for the repeating data.
> ``` SQL
>
> (
> SELECT first_name FROM actor
> )
> UNION ALL
> (
> SELECT first_name FROM customer
> );
>```
> ![image](https://user-images.githubusercontent.com/57245919/131897249-4d7e9a8a-d184-4a85-a063-3eb5b2cd83cd.png)
