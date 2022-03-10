This folder contains a collection and a default environment to test GET method of https://gorest.co.in/public/v2/users API endpoint.

You can either import collection and environment to Postman and run it in GUI or just use `newman` to run the collection in command line:
```
$ newman run GET_users.postman_collection.json -e Default_env.postman_environment.json
```
