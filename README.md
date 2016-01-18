# multi-module-maven-archetype example

To install archetype into your local machine

     mvn clean install
     
To create new archetype 

     mvn archetype:generate -DarchetypeCatalog=local
     
Then select the iot.devicetype:iot-device-type-archetype (iot-device-type-archetype) as new artifact. Then you need to provide groupId, artifactId, version and packging as shown bellow.

       Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 8
       Define value for property 'groupId': : org.coffeeking
       Define value for property 'artifactId': : connectedcup
       Define value for property 'version':  1.0-SNAPSHOT: : 1.0.0-SNAPSHOT
       Define value for property 'package':  org.coffeeking: : 
       Confirm properties configuration:
       groupId: org.coffeeking
       artifactId: connectedcup
       version: 1.0.0-SNAPSHOT
       package: org.coffeeking
       Y: : 


     

