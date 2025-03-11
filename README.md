# Question 


Spring Boot application with JPA (Hibernate) and H2 database, implementing: 
Employee-Address (1:N) Relationship 

Query : Fetching Employees with Address having Max Priority 

Result -
```
[
    {
        "id": 1,
        "name": "Ruchir",
        "addressId": 2,
        "city": "XYZ",
        "state": "Delhi",
        "priority": 2
    },
    {
        "id": 2,
        "name": "John",
        "addressId": 3,
        "city": "UWD",
        "state": "Delhi",
        "priority": 1
    },
    {
        "id": 3,
        "name": "Sam",
        "addressId": 6,
        "city": "PQR",
        "state": "Delhi",
        "priority": 4
    },
    {
        "id": 4,
        "name": "Sara",
        "addressId": 7,
        "city": "HIJ",
        "state": "Mumbai",
        "priority": 2
    }
]
```
