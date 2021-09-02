# 10-Left-Right-FullJoin

![img_leftjoin](https://user-images.githubusercontent.com/57245919/131883545-cea1afb7-61f5-4b6a-9414-8a324247df89.gif) 
![img_rightjoin](https://user-images.githubusercontent.com/57245919/131883548-4fd4bcde-b435-46bb-9b59-53404d2e0ee3.gif) 
![img_fulljoin](https://user-images.githubusercontent.com/57245919/131883549-469d3816-8912-4f27-949b-a40472c9cf91.gif)


>1- Write the LEFT JOIN query where we can see the ***city*** and ***country*** names in the **city** table and **country** tables together.
>``` SQL
> SELECT city.city, country.country FROM city LEFT JOIN country --  first table is important in LEFTJoin
> ON country.country_id = city.country_id;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131696044-83d5a428-7835-4589-b66a-934555adf31d.png)
>
>2- Write the RIGHT JOIN query where we can see the ***payment_id*** in **payment** table and the ***first_name*** and ***last_name*** columns in the **customer** table.
>``` SQL
> SELECT payment.payment_id, customer.first_name, customer.last_name FROM customer RIGHT JOIN payment -- second table is important in Right Join
> ON payment.customer_id = customer.customer_id;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131889777-40fb6c84-f9e9-4a07-a63b-6e251b19009c.png)
>
>3- Write the FULL JOIN query where we can see ***rental_id*** in **rental** table and ***first_name*** and ***last_name*** in **customer** table. 
> ``` SQL
> SELECT rental_id, first_name, last_name FROM customer FULL JOIN rental
> ON customer.customer_id = rental.customer_id;
>```
> ![image](https://user-images.githubusercontent.com/57245919/131889851-58088ff4-2ad2-4c75-825e-b623e5a9e002.png)
>
