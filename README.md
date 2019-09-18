# Backend Assignment

Java web application based on the standard servlet spec.

The application provide a RESTful API that retrieve transactions from ​OpenBank​ sandbox
and transforms the data to a Backbase friendly format.

##### Available endpoints:

    1. Transactions list: 
        
        `/transaction/list/{bankId}/{accountId}/{viewId}`
        
    2. Transaction filter based on transaction type:
        
        `/transaction/type/{txnType}/{bankId}/{accountId}/{viewId}`
        
    3. Total amount for transaction type
        
        `/transaction/amount/{txnType}/{bankId}/{accountId}/{viewId}`

For detailed information go to `Swagger - RESTful API Documentation` section.

##### Note: External requests are secured, please watch `Security` section

## Build & Run Project
### Assuming that you have installed `git` in your local environment.
1. Download the project

    `git clone https://github.com/CypraxPuch/backendassignment.git`

2. Change to the recent directory created `$ cd backendassignment/`
    
3. Add execution permissions to the startUp shell script:
    `chmod 775 startUpBackendAssignment.sh` 

3. Execute startup shell script.

    `./startUpBackendAssignment.sh`

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

