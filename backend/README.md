
Docker##
docker run -p 8000:8000/tcp -p 27017:27017/tcp -v d:\cci-rad:/data -itd 787889cee386
mongod -f /etc/mongod.conf  --bind_ip 0.0.0.0 &
yum install redis
redis-server &






























# TechChat Backend
[![Build Status](http://heroku-badge.herokuapp.com/?app=open-source-at-mtu-tech-chat&root=api/&style=flat)](https://open-source-at-mtu-tech-chat.herokuapp.com/web/)

## Table of Contents
 - [Getting started](#getting-started)
 - [Deploying](#deploying-with-jenkins)

## Getting started
1.  Clone this repository: `git clone https://github.com/mtuopensource/TechChat.git`
2.  Open a terminal and navigate to the backend directory
3.  Run `pip install -r requirements.txt`
4.  Run `py manage.py runserver`

## Unit Tests
1.  Clone this repository: `git clone https://github.com/mtuopensource/TechChat.git`
2.  Open a terminal and navigate to the backend directory
3.  Run `py manage.py test api.tests`

## Heroku
Heroku is a free hosting service for small projects. Easily setup and deploy from the command line via Git.
### Buildpacks:
1.  `heroku buildpacks:clear` 
2.  `heroku buildpacks:set https://github.com/timanovsky/subdir-heroku-buildpack` 
3.  `heroku buildpacks:add heroku/python` 
### Environment Variables:
1.  `heroku config:set PROJECT_PATH='backend'` 
2.  `heroku config:set DISABLE_COLLECTSTATIC=1` 
3.  `heroku config:set DJANGO_SETTINGS_MODULE='common.settings'`
4.  `heroku config:set ENCODING='utf-8'`
5.  `heroku config:set DJANGO_SETTINGS_MODULE='mongodb://user:password@localhost/db?authSource=tech_chat'`
### Deployment
1. Deploy from the Heroku web interface
3. Run `heroku ps:scale web=1`  

================Install Custom by Me===============
https://packaging.python.org/guides/installing-using-pip-and-virtualenv/

"c:\Python37-32\python.exe" -m pip install --user virtualenv

"c:\Python37-32\python.exe" -m pip install --upgrade pip

"c:\Python37-32\python.exe" -m virtualenv env

.\env\Scripts\activate

Add: 


c:\Python37-32\python.exe manage.py migrate --run-syncdb