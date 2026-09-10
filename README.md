# Event Manager API

A small CRUD REST API built with Spring Boot and PostgreSQL, created to practice 
backend fundamentals (Git, SQL, REST) before applying for backend roles.

## Stack
- Java, Spring Boot
- Spring Data JPA + PostgreSQL
- Tested with Postman

## Endpoints
- `GET /events` — list all events
- `POST /events` — create an event
- `PUT /events/{id}` — update an event
- `DELETE /events/{id}` — delete an event

## Run locally
1. Create a PostgreSQL database named `events_db`
2. Set the `DB_PASSWORD` environment variable
3. Run `EventManagerApplication`
