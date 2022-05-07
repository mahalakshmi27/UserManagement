# RESTful CRUD APIs for User Data

This repository includes a basic REST API for performing CRUD operations on user data. It is built using Spring framework. MongoDB is used for data persistence.

## Run and Test

To run the application,
```
mvn spring-boot:run
```

To execute unit tests
```
mvn test
```
For unit tests, JUnit is used.

## Endpoints

**Create a user**

```
/users [POST]

Content-Type: application/json
{
    "name": string,
    "dob": "yyyy-mm-dd",
    "address": string,
    "desc": string
}
```

When user is successfully created, 201 Status code and newly created user are returned.

**Get all users**

```
/api/users [GET]
```

Fetches all users.

**Get a user**

```
/api/users/id [GET]
```

Fetches a user with the given id.

**Update details for a user**

```
/users/id [PUT]

Content-Type: application/json
{
    "name": string,
    "dob": "yyyy-mm-dd",
    "address": string,
    "desc": string
}
```

Update the user details with the given id.

**Delete a user**

```
/users/id [DELETE]
```

Delete the user with the given id.
