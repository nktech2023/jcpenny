    1  sudo yum update -y
    2  sudo hostnamectl set-hostname git
    3  su - ec2-user
    4  exit
    5  sudo yum install git vim -y
    6  ll
    7  mkdir landmark
    8  ll
    9  cd landmark/
   10  git init
   11  git status
   12  git branch
   13  clear
   14  git pull https://github.com/nktech2023/jcpenny master
   15  git status
   16  ll
   17  ls -l  README.md
   18  cat README.md
   19  git status
   20  git branch
   21  git remote -v
   22  git config --global user.email "tinaxopher46@gmail.com"
   23  git config --global user.name "Overcomer101"
   24  git remote -v
   25  git remote add sales https://github.com/nktech2023/jcpenny/
   26  git remote -v
   27  git status
   28  vim newfile.sh
   29  git status
   30  git add -a -m "my first commit"
   31  git add --all
   32  git status
   33  git commit -m "my first commit"
   34  git push sales master
   35  clear
   36  history

