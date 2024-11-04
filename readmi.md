# Инструкцией по развертыванию: необходимо запустить docker-compose.yml

# По адресу необходимо получить токен и вставлять токен в запросы
```
curl -X POST http://localhost:18080/realms/sds/protocol/openid-connect/token
Authorization: Basic c2RzLWFwcDoqKioqKioqKioq
-H "Content-Type: application/x-www-form-urlencoded" \
-d '{
grant_type: "client_credentials"
scope: "sds"
}'
```
после 

# Student API Documentation

## 1. Get All Students

**Endpoint:**  
`GET /student/all`

**Description:**  
Fetches all students.

**CURL Example:**

```
curl -X GET http://localhost:8080/student/all
```

## 2. Update a Student

**Endpoint:**  
`POST /student/update/:id`

**Description:**  
Updates the details of a student by their ID.

**CURL Example:**

```
curl -X POST http://localhost:8080/student/update/{id} \
-H "Content-Type: application/json" \
-d '{
"id": "123",
"firstName": "John",
"lastName": "Doe",
"secondName": "Middle",
"groupName": "CS101",
"avgGrade": 3.5
}'
```

## 3. Create a New Student

**Endpoint:**  
`PUT /student/create`

**Description:**  
Creates a new student record.

**CURL Example:**

```
curl -X PUT http://localhost:8080/student/create \
-H "Content-Type: application/json" \
-d '{
"firstName": "Jane",
"lastName": "Smith",
"secondName": "Middle",
"groupName": "CS101",
"avgGrade": 4.0
}'
```

## 4. Delete a Student

**Endpoint:**  
`DELETE /student/delete/:id`

**Description:**  
Deletes a student by their ID.

**CURL Example:**

```
curl -X DELETE http://localhost:8080/student/delete/{id}
```
