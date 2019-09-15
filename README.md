# Backend Assignment

Java web application based on the standard servlet spec.

The application provide a RESTful API that retrieve transactions from ​OpenBank​ sandbox
and transforms the data to a Backbase friendly format.

For detailed information go to `Swagger - RESTful API Documentation` section.

##### Note: External requests are secured, please watch `Security` section

## Build & Run Project
### Assuming that you have installed `git` in your local environment.
1. Download the project

    `git clone https://github.com/CypraxPuch/backendassignment.git`

2. Build the project

    Change to the recent directory created `$ cd backendassignment/`
    
    Execute `$ mvn clean install`

3. A `war file` should be generated inside the project directory `tarjet/`
    
    ### Example
    
    if your `home directory` is: `/home/gpucheta/proyectos/backbase/backendassignment/`
    
    then the `war file` will be located in: 
    
    `/home/gpucheta/proyectos/backbase/backendassignment/target`
    
    The `war file name` is: `backendassignment.war`   

    ##### Important: You can deploy the `war file` in any Application Server, for this example i've used Apache-Tomcat v8.5.45

4. Copy the war file generated in step 3, into `webapps` directory of your Tomcat installation.

5. Execute startup shell script from Tomcat.

    `<TOMCAT-HOME>/bin/startup.sh`

6. Send requests to the endpoints.

    `curl -u user:password localhost:8080/backendassignment/transaction/amount/SANDBOX_TAN/rbs/savings-kids-john/public`

    `curl -u user:password localhost:8080/backendassignment/transaction/type/SANDBOX_TAN/rbs/savings-kids-john/public`
    
    `curl -u user:password localhost:8080/backendassignment/transaction/list/rbs/savings-kids-john/public`
    
    Important: If credentials are not provided then the endpoint will not response anything.

# Swagger - RESTful API Documentation

  Once the application is Up & Running, you can find the API documentation in:

  ### UI (Recommended as this is a very friendly view)
  http://localhost:8080/backendassignment/swagger-ui.html

  ### Json format
  http://localhost:8080/backendassignment/v2/api-docs

# Security

  The endpoints are secured in a very basic way for this demo with `spring-security framework`
  
  #### The credentials are:
    
    user/password
    
  #### Example with credentials
  
    `curl -u user:password localhost:8080/backendassignment/transaction/amount/SANDBOX_TAN/rbs/savings-kids-john/public`

    `curl -u user:password localhost:8080/backendassignment/transaction/type/SANDBOX_TAN/rbs/savings-kids-john/public`
    
    `curl -u user:password localhost:8080/backendassignment/transaction/list/rbs/savings-kids-john/public`
    
  ### Note: for security reasons, if credentials are not provided then the endpoint will not response.

