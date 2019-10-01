# We are gonna a create a modern js project

# Objective:
## we will create npm package for the spinners using React

### Steps:

	* Step 1:-Create a github repo

		* go to github create a repo but first check whether there 
	  	  already exists an npm package with this name or not
		  
	   	* Enter the unique project name
		* Enter the description, Add README.md , Add MIT license


	* Step 2:- Setting up a project

		* git clone
		* npm init -y
			* open package.json [change the license name, add keywords, author]
			* commit those changes and push to github
		
		* Linting:-
			* we will set the rules for our code inside the .editorconfig
			
			* seach for editorconfig

			```code
			root=true;

			[*]
			end_of_line = lf
			insert_final_newline = true
			indent_style = space
			indent_size = 2
			trim_trailing_whitespace=true

			```
			* this linting is just for the code we will also set some formal linting

			
		 
	        * eslint
			* install the eslint npm package as dev dependency

		* .gitignore 
			* add the gitignore with the node_module


		* create folder src/index.js put some command with wrong syntax
		* go to parent directory
		* npx eslint --init --save-d
			* this will install dependencies and add the eslint.rc file
			* npx eslint src/index.js 
				`this will through some error but it wont forat the code`

		* prettier eslint
			* install it as dev dependency
			* also install the cli version
		* npx prettier-eslint 'src/index.js'
			* this will write in terminal but will not add format the code in the editor












