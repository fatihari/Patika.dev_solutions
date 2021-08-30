# 07-GroupBy-Having

>1- Group the movies in the **film** table according to their **rating** values.
>``` SQL
> SELECT rating, COUNT(*) FROM film --How many of each "rating" are there?  => COUNT(rating_i) = COUNT(*)
> GROUP BY rating; 
>```
> ![image](https://user-images.githubusercontent.com/57245919/131381422-7d18af0d-47bc-457a-bb90-b824688fc573.png)
>
>2- When we group the movies in the **film** table according to the **replacement_cost** column, select the **replacement_cost** value with more than 50 movies and the corresponding number of movies.
>``` SQL
> SELECT replacement_cost, COUNT(*) FROM film
> GROUP BY replacement_cost
> HAVING COUNT(*) > 50; -- Group Condition, very similar to 'WHERE'
>```
> ![image](https://user-images.githubusercontent.com/57245919/131382309-1ded0740-c9c5-47e9-ab44-a3c027c71e2d.png)
>
>3- What are the customer numbers corresponding to the **store_id** values in the **customer** table?
>``` SQL
> SELECT store_id, COUNT(*) FROM customer
> GROUP BY store_id;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131382624-e6673700-768e-4527-a9ff-2fc332a4bcb4.png)
>
>4- After grouping the city data in the **city** table according to the **country_id** column, select the **country_id** information with the highest number of cities and the number of cities. 
>``` SQL
> SELECT country_id, COUNT(*) FROM city
> GROUP BY country_id
> ORDER BY COUNT(*) DESC
> LIMIT 1;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131383515-199e20eb-c38a-46ea-8d17-e89afedc587c.png)

