# testweblogic
spring boot app that deploys in weblogic server


- tested on weblogic 14.1.1
- tested on postgresql 13.1
- requires datasource with JNDI name = test
- HTTP Endpoints
    - `/wl/employee/all` of type GET
    - `/wl/employee/search` of type POST
    

- `/wl/employee/search` requires JSON body with the following parameters:
    - "id" : Integer,
    - "name" : String,
    - "title" : String,
    - "salary" : String,
    - "bonusStructure" : String,
    - "timeOff" : Integer,
    - "timeOffStart" : Integer,
    - "timeOffEnd" : Integer,
    - "sickTime" : Integer,
    - "sickTimeStart" : Integer,
    - "sickTimeEnd" : Integer,
    - "healthPlan" : String,
    - "visionPlan" : String,
    - "dentalPlan" : String,
    - "plan" : Integer,
    - "planStart" : Integer,
    - "planEnd" : Integer,
    - "savings" : Integer,
    - "savingsStart" : Integer,
    - "savingsEnd" : Integer
    
- if any of the parameters mentioned above is not to be used, can be set to null or removed from the JSON altogether

- example:
{
  "id":2,
  "name":"Marie Sylvester",
  "title":"Programmer",
  "salary": "85,0",
  "bonusStructure": "1% Quar",
  "timeOff": 10,
  "timeOffStart": 9,
  "timeOffEnd": 11,
  "sickTime": 2,
  "sickTimeStart": 1,
  "sickTimeEnd": 3,
  "healthPlan": "Blue Cross and Blue Shie",
  "visionPlan": "a Vision",
  "dentalPlan": "ental",
  "plan": 22000,
  "planStart": 21000,
  "planEnd": 23000,
  "savings": 16000,
  "savingsStart": 15000,
  "savingsEnd": 17000
  }