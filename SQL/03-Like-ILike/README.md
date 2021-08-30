# 03-Like-ILike

>1- Select the country names in the country column in the country table, starting with the 'A' character and ending with the 'a' character.
>``` SQL
> SELECT country FROM country
> WHERE country LIKE 'A%a';
>```
> ![image](https://user-images.githubusercontent.com/57245919/131330473-d9c64e2c-3f7c-4ce6-a20c-c02ecbd86cc1.png)
>
>
>2- Select the country names in the country column of the country table, consisting of at least 6 characters and ending with the 'n' character.
>``` SQL
> SELECT country FROM country
> WHERE country LIKE '_%_%_%_%_%n';
>```
>
> ![image](https://user-images.githubusercontent.com/57245919/131330386-04b0e613-b822-4686-b443-d305bdf63a90.png)
>
>
>3- From the movie titles in the title column of the movie table, select at least 4 movie titles containing the 'T' character, regardless of upper or lower case letters.
>``` SQL
> SELECT title FROM film
> WHERE title ILIKE '%t%t%t%t%';
>```
> ![image](https://user-images.githubusercontent.com/57245919/131330301-c670676f-d8fd-4f25-a5dc-231a67e2615d.png)
>
>
>4- From the data in all the columns in the movie table, select the data that starts with the title 'C' character, has a length greater than 90 and a rental_rate of 2.99.
>``` SQL
> SELECT * FROM film
> WHERE title LIKE 'C%' AND length >= 90 AND rental_rate = 2.99; 
>```
> ![image](https://user-images.githubusercontent.com/57245919/131331160-e26eab7c-1e09-4bed-92b1-0ad1b01b754c.png)
>
>


