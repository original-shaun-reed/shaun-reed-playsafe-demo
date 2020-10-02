##shaun-reed-playsafe-demo

IntelliJ was used while developing this maven project, using Spring/Spring Boot 2.2.10 and Java 8

When cloning this project and opening in the IDE, please make sure that the maven dependencies are imported, when that is done you may run the project
***
##NB: I made use of the LOMBOK plugin to save myself time from unnecessary creation of getters and setters in my POJOs. Please install that plugin if it doesn't pull through from the **pom.xml** file when importing maven dependencies  
***

When running this project the default host will be  **http://localhost:8080** 

*When the project is in runtime;*
<br />There are three end points (APIs) that has their unique request and response bodies with a ***Content-Type: application/json*** header when making use of these APIs
***
***
### *Example for KELVIN to CELSIUS conversion:*

POST
<br />**http://localhost:8080/conversion/kelvinToCelsius**

Request body
<br />**{ "kelvin": 500 }**

Response body:
<br />**{ "celsius": 226.85 }**
***
### *Example for POUNDS to KILOGRAMS conversion*

POST
<br />**http://localhost:8080/conversion/poundsToKilograms**

Request body
<br />**{ "pounds" : 140 }**

Response body:
<br />**{ "kilograms": 63.56 }**
***
### *Example for MILES to KILOMETERS conversion:*

POST
<br />**http://localhost:8080/conversion/milesToKilometers**

Request body:
<br />**{ "miles" : 120 }**

Response body:
<br />**{ "kilometers": 193.1208 }**
***



