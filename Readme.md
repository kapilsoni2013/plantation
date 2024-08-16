
### Docker Postgres
docker run  --name MyPostgresDB  -e POSTGRES_DB=plantation -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=root -e PGDATA=/var/lib/postgresql/data/pgdata -v pgdata:/var/lib/postgresql/data -p 5432:5432 postgres:16.4

https://medium.com/@Lakshitha_Fernando/jwt-spring-security-6-and-spring-boot-3-with-simple-project-819d84e09af2
