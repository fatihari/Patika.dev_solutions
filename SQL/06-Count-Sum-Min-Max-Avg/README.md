# 06-Count-Sum-Min-Max-Avg

>1- What is the **average** of the values in the **rental_rate** column in the **film** table?
>``` SQL
> -- AVG(column) = the average of the values in the column. 
> SELECT ROUND(AVG(rental_rate), 2) FROM film;    -- ROUND(value, 2) = shows 2 digits. 
>```
> ![image](https://user-images.githubusercontent.com/57245919/131373661-f01d68d5-17da-4c26-90ef-87499edb4951.png)
>
>2- **How many** of the movies in the **film** table start with the 'C' character?
>``` SQL
> SELECT COUNT(*) FROM film   -- COUNT(*) = ROW COUNT
> WHERE title LIKE 'C%';
>```
> ![image](https://user-images.githubusercontent.com/57245919/131374159-2da6c87f-b7a4-471e-bf9d-8c4792ab3bbf.png)
>
>3- How many minutes is the longest (**length**) movie whose **rental_rate** value is equal to 0.99 among the movies in the **film** table?
>``` SQL
> -- MAX(column) = maximum value in column.
> SELECT MAX(length) FROM film
> WHERE rental_rate = 0.99;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131374615-8a7eddac-d2c3-4af9-b8d0-0fc60e06b3a3.png)
>
>4- How many ***different*** **replacement_cost** values are there for the movies in the **film** table with a **length** greater than 150 minutes?
>``` SQL
> -- DISTINCT(column_name) = columns with different values 
> SELECT COUNT(DISTINCT replacement_cost) FROM film
> WHERE length > 150;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131375287-a8c971a5-1203-4acb-ae0c-a3deff238442.png)
