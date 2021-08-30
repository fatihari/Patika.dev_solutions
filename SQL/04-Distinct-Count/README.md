# 04-Distinct-Count
>1- Select different values in the 'replacement_cost' column in the 'movie' table.
>``` SQL
> SELECT DISTINCT replacement_cost FROM film;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131352709-f622c098-e656-4bb5-bf18-bb5a7080dc83.png)
>
>
>2- How many different data are there in the 'replacement_cost' column in the 'movie' table?
>``` SQL
> SELECT COUNT(DISTINCT replacement_cost) FROM film;
>```
>
> ![image](https://user-images.githubusercontent.com/57245919/131353012-7ddbc77b-1c32-4b9a-9514-a8b43a6fc02b.png)
>
>
>3- How many of the movie titles in the 'movie' table start with the character T and at the same time the 'rating' is equal to 'G'?
>``` SQL
> SELECT COUNT(*) FROM film
> WHERE title LIKE 'T%' AND rating = 'G';
>```
> ![image](https://user-images.githubusercontent.com/57245919/131356122-d3081e73-e1ae-4bb8-aa10-49cb3ef37d1f.png)
>
>
>4- How many of the country names (country) in the 'country' table consist of 5 characters?
>``` SQL
> SELECT COUNT(*) FROM country
> WHERE country LIKE '_____';
>```
> ![image](https://user-images.githubusercontent.com/57245919/131354380-838927d5-d603-4d08-b823-ad7ff0f9a6ef.png)
>
>5- How many of the city names in the 'city' table end with the character 'R' or r? 
>``` SQL
> SELECT COUNT(*) FROM city
> WHERE city ILIKE '%r'; -- ILIKE is case insensitive LIKE. 
>```
> ![image](https://user-images.githubusercontent.com/57245919/131355752-c25b44c7-c3b1-419e-beb3-4297b4ce3909.png)
