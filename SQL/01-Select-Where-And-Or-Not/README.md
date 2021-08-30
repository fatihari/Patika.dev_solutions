# 01-Select-Where-And-Or-Not

>1- Select the data in the title and description columns in the movie table.
>``` SQL
> SELECT title, description FROM film;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131270678-e0e7f148-ace4-44d2-bdb5-418e1b7572a3.png)
>
>
>2- Select the data in all columns in the movie table with the movie length greater than 60 AND less than 75.
>``` SQL
> SELECT * FROM film
> WHERE length > 60 AND length < 75;
>```
>
> ![image](https://user-images.githubusercontent.com/57245919/131270639-fb94cf29-f77c-4900-928a-e7f3cc20669f.png)
>

>3- Select the data in all columns in the movie table with rental_rate 0.99 AND replacement_cost 12.99 OR 28.99.
>``` SQL
> SELECT * FROM film
> WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 
> OR replacement_cost = 28.99);
>```
> ![image](https://user-images.githubusercontent.com/57245919/131270778-c7578685-6612-45f7-abb8-2f94e8416cc0.png)
>

>4- What is the value in the last_name column of the customer whose value is 'Mary' in the first_name column of the customer table?
>``` SQL
> SELECT first_name, last_name FROM customer
> WHERE first_name = 'Mary' 
>```
>![image](https://user-images.githubusercontent.com/57245919/131270963-773ab0e8-f18d-4c37-8906-8faf575fad50.png)


>5- In the movie table, select the data whose length is NOT greater than 50 and at the same time, the rental_rate value is 2.99 or NOT 4.99.
>``` SQL
> SELECT * FROM film
> WHERE NOT length > 50 AND (rental_rate = 2.99 OR NOT rental_rate = 4.99)
>```
> ![image](https://user-images.githubusercontent.com/57245919/131271143-b618dbd0-764d-429a-a105-fd9a1a3d2bf5.png)

