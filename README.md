##First Login App

###Prerequisites you need;
* JDK Version 1.8.0_73
* mysql Server version: 5.6.28-0
* apache-maven-3.3.9
* mongodb-linux-i686-3.2.3
* tomcat-8.0.32

###How to configure 
- Open the terminal and shutdown the tomcat server if it is running, by the command ``$CATALINA_HOME/binshutdown.sh``.
- Then move to the application directory 'LogAppNew' by ``cd /Projects/LogAppNew`` and type ``mvn clean install``.
- Then it builds the project and make the war file as LogAppNew.war inside the LogAppNew directory.

###How to deploy in Tomcat server
- Then copy the LogAppNew.war file into your tomcat's webbapps directory as follows.
``~/LogAppNew$ cp LogAppNew.war /usr/local/tomcat-8.0.32/webapps ``
- Start the tomcat server by the command ``$CATALINA_HOME/bin/startup.sh start``.

###How to run
- Open the browser and type the URL as "localhost:8080/LogAppNew" or "127.0.0.01:8080/LogAppNew". (here 8080 is the tomcat's configured port)
- Then the index page of the application should appear.
- Also, if you navigate to the localhost:8080/manager, you will see a directory named /LogAppNew. When click on it also gives the index page.
