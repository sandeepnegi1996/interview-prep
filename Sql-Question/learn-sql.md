
## Important Topics:-

1. Primary key : Columns or group of columns which will uniquely identify the row.

2. Foreign Key : Primary key in one table when put in some other table to create a realtion is called as foreign key
3. Joins: 
	1. inner join
	2. left join
	3. right join
	4. full join
4. Normalizaiton:-
	* Minimize the data-redundancy  by organizing the data into multiple related tables
	* The redundancy will lead to certain anomalies such as insertion,deletion,updation anamoly

	 | RollNo | Name | Branch | HOD | Dep_PhoneNo |
	 |--------|------|--------|-----|-------------|
	 | 1      | Akon | CSE	  | Mr.X| 5667        |
	 | 2	  | Bkon | CSE    | Mr.X| 5667	      |
	 | 3	  | Ckon | CSE	  | Mr.X| 5667	      |



	* Inseriton :  so what is insertion anamoly aassume we want to enter the 100 students info
	  for that all the details of the branch,HOD,Dep_phoneNo will be added again and that will increase the size of the database
	  this is the insertion anamoly

	* Deletion :  Assume we want to delete all the students details in that case all the branch details will also be removed 
			this is the deletion anamoly.
        * Updation : Assume we are updating the records and we have updated the HOD name since new HOD is alloted to CS department
		     than all the rows needs to be updated and if any row is not updated it will lead to updation anamoly.
	
	* ------------------------------------------------------------------
	* To overcome this we will divide the table into 2 table one is for the roll number other is for the branch table which will help to 
	 remove this anamoly.

5. View
6. what is index.
7. what is cursor.
8. what is procedure:- It is a fucntion with the set of sql statements and can be called whenever required.
9. what is trigger :- It is just a piece of code that gets executed, response to some event on table or view.

10. Differentiate between Delete and Trucate and Drop:
	* Truncate removes all the rows from the table and this cannot be rollback
	* whereas delete will delete particular rows,it will delete according to where clause and can be roll back
	* Drop command removes the table from the database and it cannot be rolled back.
11. Local and Global Varibales: 
	* Local varibale are scoped inside the function cannot be used outside the function
	* Global variables are globally scoped cann be used any where in the program





* -------------------------------------------------------------------------------
	# SQL Queries
	1.  Write An SQL Query To Fetch Unique Values Of DEPARTMENT From Worker Table.
		
	* select distinct DEPARTMENT from Worker

	2. Write a SQL query to fetch the first three characters of FIRST_NAME from Worker Table ?

	* select substring(FIRST_NAME,1,3) from Worker

	3. Write a SQL query to print FIRST_NAME from Worker table after removing the white spaces from right.

	* select RTRIM(FIRST_NAME) from Worker

	4. write a sql query to print the department name from Worker table after removing space from left ?
	
	* select LTRIM(DEPARTMENT) from Worker

	5. Sql query to print the unique values of Department from worker table and its length ?

	* select distinct length(DEPARTMENT) form Worker

	6. Write An SQL Query To Print The FIRST_NAME And LAST_NAME From Worker Table Into A Single Column
	COMPLETE_NAME. A Space Char Should Separate Them.

	* select concat(FIRST_NAME,' ',LAST_NAME) from Worker

	7. Write An SQL Query To Print All Worker Details From The Worker Table Order By FIRST_NAME Ascending.

	* select * from Worker order by FIRST_NAME asc.

	8. Write An SQL Query To Print All Worker Details From The Worker Table Order By FIRST_NAME Ascending And DEPARTMENT Descending.
	
	* select * from Worker order by FIRST_NAME asc,DEPARTMENT desc.

	9. Write An SQL Query To Print Details For Workers With The First Name As “Vipul” And “Satish” From Worker Table.

	* select * from Worker where FIRST_NAME in ('Vipul','Satish')

	10. Write An SQL Query To Print Details Of Workers Excluding First Names, “Vipul” And “Satish” From Worker Table.

	* select * from Worker FIRST_NAME not in ('Vipul','Satish')

	11. Write An SQL Query To Print Details Of Workers With DEPARTMENT Name As “Admin”.
	
	* selet * from Worker where DEPARTMENT like 'Admin%'

	12. Write An SQL Query To Print Details Of The Workers Whose FIRST_NAME Contains ‘a’.

	* select * from Worker where FIRST_NAME like '%a%' .

	13. Write An SQL Query To Print Details Of The Workers Whose FIRST_NAME Ends With ‘A’.
	
	* select * from Worker where FIRST_NAME like '%a' .

	14. The Count Of Employees Working In The Department ‘Admin’. 
	
	* select count(*) from Worker where DEPARTMENT="admin"

	15. Write An SQL Query To Fetch Worker Names With Salaries >= 50000 And <= 100000.

	* select FIRST_NAME from Worker where Salaries BETWEEN 50000 AND 10000.

	16. 





