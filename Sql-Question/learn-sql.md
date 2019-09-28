
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




