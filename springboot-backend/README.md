# Springboot-backend — H2 and Swagger added

What's changed
- Added H2 in-memory database dependency to `pom.xml` for local/dev testing.
- Added Springdoc OpenAPI (Swagger UI) dependency to `pom.xml` to expose API docs and UI.
- Added `src/main/resources/application-h2.properties` with H2 datasource configuration and enabled H2 console.
- Added `src/main/java/net/javaguides/springboot/config/OpenApiConfig.java` to set API metadata (optional).

How to run with H2 (local dev)

1. Build and run with Maven (recommended):

```powershell
mvn -Dspring-boot.run.profiles=h2 spring-boot:run
```

2. Or build and run the jar:

```powershell
mvn package
java -jar target\springboot-backend-0.0.1-SNAPSHOT.jar --spring.profiles.active=h2
```

What to check

- Swagger UI: http://localhost:8080/swagger-ui/index.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs
- H2 Console: http://localhost:8080/h2-console
  - JDBC URL: `jdbc:h2:mem:testdb`
  - User: `sa` (empty password)

Sample curl (create a new employee)

```powershell
curl -X POST "http://localhost:8080/api/v1/employees" -H "Content-Type: application/json" -d "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"emailId\":\"john.doe@example.com\"}"
```

Notes

- I attempted to run `mvn -DskipTests package` in this environment but `mvn` was not found on the PATH (see terminal output). Please run the commands above in your environment (or in an IDE like IntelliJ which can reimport Maven projects).
- After running a Maven build, your IDE should resolve the new dependencies and the `OpenApiConfig` imports will stop reporting errors.

If you'd like, I can:
- Remove the `OpenApiConfig` and rely on springdoc defaults, or
- Update the project to always use H2 (instead of MySQL) for CI/test by switching the default `application.properties`.


