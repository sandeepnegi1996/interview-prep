
# Basic Interview Questions:-

1. To check the kernel version 
	*   **uname -a** 
	*   **uname -v**
2. How to check the ip ?
	* ifconfig

3. How to check for free disk space
	*  **df -ah**

4. How to manage service the services ?
	* systemctl //for all the services

5. How to check the disk usage of directory
	*  **du -sh FolderName**
	* du folderName    

6. How to extract file using command ?
	* tar xvf file-name.tar
		* x means xtract
		* v means print file name in verbose mode 
		* f means this is the file name 

7. what is the use of the find command ?
	* it is used for searching and locating file.
	* we can find the file using filename,using permissions,using owners and groups and using date and time 
	* we can also find using size

8. searching file using filename
	* find . -name index.html
	* this command says search for the file index.html with the filename since we have used -name and "." means in the same directory.
	
9. find file with file name but ignore the cases ?
	* find . -iname index.html
	* -i means ignore the cases
