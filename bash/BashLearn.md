# Learning Bash
	* key features
		* file manipulation
		* program execution
		* printing text

## Use:
	* automate your daily tasks
	* create your own commands with optionally acception paramaters
	* portability executing the same script in mac and other linux system

### connecting to ec2 instance 

```
chmod 400 /path_to_key/my_key.pem
```

ssh -i "sandysshinstance.pem" ec2-user@ec2-18-224-93-207.us-east-2.compute.amazonaws.com


#### Core Bash concepts:

	* user definde varibles and system varible


##### System Variable
	* are in capital
	* Example:- BASH — Holds our shell name
				BASH_VERSION — Holds our shell version name
				HOME — Holds home directory path
				OSTYPE — Holds OS type
				USERNAME – Holds username who is currently logged in to the machine


##### user-defined varibles:
	* they are in lowercase
	* ex:- name="sandeep"     echo "$name"
		* they are  accesed using the dollar sign

#### Execute commands
	* `date` same thing which is used to for template in the javascript
	* echo "date is `date` "


#### Expressions
	* Str1 = Str2      | True if the strings are equal                 |                            
	* | Str1 != Str2     | True if the strings are not equal             |
	* | -n Str1          | True if the string is not null                | 
	* | -z Str1          | True if the string is null        


	** Numeric Comparisons
		+------------------+-----------------------------------------------+
		|   Conditions     |                    Description                |
		+------------------+-----------------------------------------------+
		| expr1 -eq expr2  | True if the expressions are equal             |
		| expr1 -ne expr2  | True if the expressions are not equal         |
		| expr1 -gt expr2  | True if expr1 is greater than expr2           |
		| expr1 -ge expr2  | True if expr1 is greater than equal to expr2  |
		| expr1 -lt expr2  | True if expr1 is less than expr2              | 
		| expr1 -le expr2  | True if expr1 is less than or equal to expr2  |
		| !expr1           | Negates the result of the expression      



##### Looping:- 
	* # Syntax for simple For loop
	for i in 1 2 3 4 5
	do
	echo "looping through $i"
	done\



#### Task1:-
	* creating a bash script that will install all the required tools


