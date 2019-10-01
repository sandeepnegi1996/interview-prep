# Learn Various Ways of Authentication

## I have created a baisc login page since the idea is given by nihal now we will add the authentication to it 

#### There are multiple ways to authenticate 
	* Cookie based authentication
	* token based authentication
	* Third party acess (O-Auth)
	* OpenId
	* SAML


### Cookie Based Authentication
	* in this authentication the credentials are verified at server side and session id is created and stored in server(stateful)
	then this session id is transfered to client(browser) in set cookie form.For further connection the session id is matched on server
	and connection is verified.
	and on log out it will be removed from the server and client-cookie.






### Cookie vs Local Storage vs Session Storage

#### Local and Session storage:
	* they body are similar its just session storage ends with tab close Local storage never closeOB 

#### Cokkie storage:
	* send with request = send to server on each request
	* stored in browzer and server
	* 

	
