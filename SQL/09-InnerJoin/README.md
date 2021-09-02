# 09-InnerJoin

>1-Please write the INNER JOIN query where we can see the names of ***city*** and ***country*** in **city** table and **country** table together.
>``` SQL
> SELECT city, country FROM country INNER JOIN city
> ON country.country_id = city.country_id;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131696044-83d5a428-7835-4589-b66a-934555adf31d.png)
>
>2- Write the INNER JOIN query where we can see ***payment_id*** in **payment** table and ***first_name*** and ***last_name*** in **customer** table together. 
>``` SQL
> SELECT payment_id, first_name, last_name FROM payment INNER JOIN customer
> ON payment.customer_id = customer.customer_id;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131860447-e3800d7f-575e-4053-99f3-e5981599d6b1.png)
>
>3- Write the INNER JOIN query where we can see ***rental_id*** in **rental** table and ***first_name*** and ***last_name*** in **customer** table together. 
> ``` SQL
> SELECT rental.customer_id, first_name, last_name FROM rental INNER JOIN customer
> ON rental.customer_id = customer.customer_id;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131860066-b0d7faa8-ff65-4c0a-abf3-727b21a28628.png)
>


