
#!/bin/bash/
#######################################
# Bash script to install apps on a new system (Ubuntu)
# Written by sandeep
#######################################

### List of items i need for my machine
# chrome
# firefox
# vscode
# node js
# angular-cli
# htop

## Update packages and Upgrade system
sudo apt-get update -y

## Git ##
echo '###Installing Git..'
sudo apt-get install git -y

# Git Configuration
echo '###Congigure Git..'

echo "Enter the Global Username for Git:";
read GIT_USER;
git config --global user.name "${GIT_USER}"

echo "Enter the Global Email for Git:";
read GIT_EMAIL;
git config --global user.email "${GIT_EMAIL}"


### Chrome ###
echo '###Installing chrome..'
#wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
#sudo dpkg -i google-chrome-stable_current_amd64.deb

### node js ###
echo "### Installing node js and npm"
sudo apt-get update -y
sudo apt install nodejs
echo "node version is `node --version` "
echo "npm version is `npm --veriosn`"


### angular-cli###
echo "installing the angular-cli"
sudo npm install -g @angular/cli

### htop ###
echo "installing the htop"
sudo apt-get install htop

### nmon ###
echo "... installing nmon "
sudo apt-get install nmon