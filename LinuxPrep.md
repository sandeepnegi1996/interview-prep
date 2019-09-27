


# Interview Questions:-

### Q.1) What is LILO ?
	* boot-loader for linux it is used to load linux into main-memory


### Q.2) What is swap space ?
	* memory on which linux hold some programs.since RAM is limited and there may be a possibility it is not able to store 
	  all the programs. The program from swap space can be easily swap in.

### Q.3) Difference between bash and DOS ?
	* 1. BASH commands are case-sensitive whereas DOS commands are not.
	* 2. BASH directory separator is '/' and in DOS the directory separator is '\'
	* 3. BASH files can be of any extension DOS it should be 8 character long and 3 character in extension


### Q.4) Find the current memory usage in linux ?
	* top
	* htop
	* free -m
	* vmstat

### Q.5) What is typical size of swap space in linux ?
	* It should be twice the physical memory that is RAM if possible otherwise it can be equal to size of physical memory

### Q.6) What are symbolic links ?
	* These are like shortcuts in windows it points to file,programs,path you can directly open that link instead of going through the 
	 whole link.

### Q.7) **What does Ctrl+alt+del does in linux ?**
	* restart without asking

### Q.8) How chmod works ?
	*  chmod [reference][operator][mode] file... 
	* refernce: is user,group,other and notaion  u,g,o
	* operator: +,-,=  //this will add,remove then the mode
	* mode: r,w,x 
	* chmod u=rwx filename.txt

### Q.9)  What is the pwd command?
	* it will print the current working directory

### Q.10) What is Daemon ?
	* it is a process that will run in banground and wait for the request. After the service request is done it is then disconnected and
	waits for further requests.
	* example:- sshd is the daemon which listens for the ssh connection
		    httpd which is listens for http connection

