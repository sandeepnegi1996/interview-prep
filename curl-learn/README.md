


# Lets- Learn Curl

### brief intro this tool is used to test the api it supports so many protocols

#### We will be using the jsonPlaceholder in our case

1. curl -i https://jsonplaceholder.typicode.com/users/1

	*  "-i" is used to view the headers in the request

2. curl -o test.txt https://jsonplaceholder.typicode.com/users/1

	* "-o" is used for the output and "test.txt" is the file_name in which i want to save the output

3. curl -O https://jsonplaceholder.typicode.com/users
	
	* "-O" will download the file name users will all the information

4. curl -O imageAddress 
	* this can dowload the image

5. make a get request:-
	* curl --data "title=sandy&body=coding is kind of super power" https://jsonplaceholder.typicode.com/posts

6. PUT request is used to update a particular record
	* curl -X PUT --data "title=sandy2" https://jsonplaceholder.typicode.com/posts/2

	* in this request we are basically updating a particular record that is second post with data title=sandy2
	* -X PUT is added to tell that this is PUT request

7. DELETE request:
	* curl -X DELETE https://jsonplaceholder.typicode.com/posts/4
	* here we have mentioned as earlier the type of request we want to made and 
	* we dont need any data parameter since we are deleting
	* watch out we have added the "4" at the end of /posts/4 this is the record we want to delete

8. FTP:-
	* we can also use the curl to download the file and upload the file to our server using FTP

10. 
