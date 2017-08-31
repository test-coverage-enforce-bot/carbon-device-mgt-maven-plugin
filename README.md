# Install cdmf-devicetype-archetype

First you need to download correct version of maven archetype.

    git clone https://github.com/wso2/carbon-device-mgt-maven-plugin.git


To install this maven archetype into your local system, from inside the carbon-device-mgt-maven-plugin

    mvn clean install

# Create sample device type plugin using cdmf-devicetype-archetype  

First download WOS2 IoT Server and copy the downloaded file to a preferred location and unzip it. The unzipped folder rename as IOTS_HOME.
To create new project go to this folder:  IOTS_HOME/samples
    
    mvn archetype:generate -DarchetypeCatalog=local
    
Then select the cdmf.devicetype:cdmf-devicetype-archetype as new archetype. 

        jobs@jobs-ThinkPad-T530:~/wso2/IoT/m3/product/IOTS_HOME/samples$ 
        mvn archetype:generate -DarchetypeCatalog=local
        [INFO] Scanning for projects...
        [INFO]                                                                         
        [INFO] ------------------------------------------------------------------------
        [INFO] Building Maven Stub Project (No POM) 1
        [INFO] ------------------------------------------------------------------------
        [INFO] 
        [INFO] >>> maven-archetype-plugin:2.4:generate (default-cli) @ standalone-pom >>>
        [INFO] 
        [INFO] <<< maven-archetype-plugin:2.4:generate (default-cli) @ standalone-pom <<<
        [INFO] 
        [INFO] --- maven-archetype-plugin:2.4:generate (default-cli) @ standalone-pom ---
        [INFO] Generating project in Interactive mode
        [INFO] No archetype defined. Using maven-archetype-quickstart (org.apache.maven.archetypes:maven-archetype-quickstart:1.0)
        Choose archetype:
        1: local -> org.apache.synapse:synapse-package-archetype (This archetype can be used to create Maven projects that bundle a mediation
                into a standalone distribution ready to be executed)
        2: local -> org.wso2.mdm:mdm-android-agent-archetype (Creates a MDM-Android agent project)
        3: local -> org.wso2.cdmf.devicetype:cdmf-devicetype-archetype (WSO2 CDMF Device Type Archetype)
        Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 3

 if the archetype is not shown, follow the **The available archetypes are not shown?** section in the  docs https://docs.wso2.com/display/IoTS310/Creating+a+New+Device+Type+via+the+Maven+Archetype

 Then you need to provide groupId, artifactId, version, packaging, name of your device type and name for sensor as shown below.
 
       Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 3
       Define value for property 'groupId': : org.homeautomation
       Define value for property 'artifactId': : smarthomemonitor
       Define value for property 'version':  1.0-SNAPSHOT: : 1.0.0-SNAPSHOT
       Define value for property 'package':  org.homeautomation: : 
       Define value for property 'deviceType': : SmartHomeMonitor
       Define value for property 'sensorType1': : currentSensor
       Define value for property 'sensorType2': : waterFlowSensor
       Define value for property 'sensorType3': : voltageSensor
       Confirm properties configuration:
       groupId: org.homeautomation
       artifactId: smarthomemonitor
       version: 1.0.0-SNAPSHOT
       package: org.homeautomation
       deviceType: SmartHomeMonitor
       sensorType1: currentSensor
       sensorType2: waterFlowSensor
       sensorType3: voltageSensor
        Y: : Y



# Find the device deployer

Copy the [devicetype]-deployer.xml inside the generated folder to the IOTS_HOME/samples folder


To deploy sample device type into IoT Server

      mvn clean install -f [devicetype]-deployer.xml
      
Note: This command should be executed place where `[devicetype]-deployer.xml` is located

# Start the WSO2 IoT Server

Start the product by executing the scripts inside  IOTS_HOME/bin in the following order

    -broker
    -iot-server
    -analytics


