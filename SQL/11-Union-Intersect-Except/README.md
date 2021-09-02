# 11-Union-Intersect-Except

### In UNION, INTERSECT and EXCEPT, column numbers and data types of columns must be the same. 

>1- Select all the data for the **first_name** columns in the **actor** and **customer** tables.
>``` SQL
>
> (
> SELECT first_name FROM actor
> )
> UNION -- "UNION ALL" is used to display both intersections.
> (
> SELECT first_name FROM customer
> );
>```
> ![image](https://user-images.githubusercontent.com/57245919/131895904-08c7ea77-20ca-41af-b8dd-a7d134fb0da3.png)
>
>2- Select the intersecting data for the **first_name** columns in the **actor** and **customer** tables.
>``` SQL
>
> (
> SELECT first_name FROM actor
> )
> INTERSECT
> (
> SELECT first_name FROM customer
> );
>```
> ![image](https://user-images.githubusercontent.com/57245919/131896191-0c2a3c76-e451-4aaa-bd68-94311cb70f11.png)
>
>3- For the **first_name** columns in the **actor** and **customer** tables, select the data in the first table but not in the second table.
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
