# Echo server

A simple REST endpoint that return the same text provided as parameter. It's also possible to ask for a waiting time to get responses.

## Project generation

I did follow the instructions on [Quarkus Docs](https://quarkus.io/guides/openapi-swaggerui), as follows:

1. Create base project

```bash
mvn io.quarkus:quarkus-maven-plugin:1.0.1.Final:create \
    -DprojectGroupId=com.jjbeto \
    -DprojectArtifactId=echo \
    -DclassName=com.jjbeto.echo.EchoResource \
    -Dpath=/echo \
    -Dextensions=resteasy-jsonb
```

2. Remove .mvn from git: added `.mvn` on `.gitignore`

3. Create basic logic: returns the same text provided as a response and accepts a query parameter to set a wait time to return the response.
    
    - Change to use root as base endpoint;
    - Returns the message path parameter back to the caller;
    - Add waiting time to respond as a query parameter;

## Swagger

Let's make it better for 3th party usage, adding swagger descriptions to "teach" how to use the API! It's easy with Quarkus as you can see [in the documentation](https://quarkus.io/guides/openapi-swaggerui).

Firstly we need to add Swagger to the project running the following command in the root folder:

```bash
./mvnw quarkus:add-extension -Dextensions="openapi"
```

But I don't like the endpoint generated `/openapi`, instead I'm going to use `/swagger`, so we can add this property to `application.properties`:

```properties
quarkus.smallrye-openapi.path=/swagger
```

The `/swagger` endpoint is going to deliver the Yaml file describing the API.

I want to activate SwaggerUI also:

```properties
quarkus.swagger-ui.always-include=true
```

The default endpoint for SwaggerUI is http://localhost:8080/swagger-ui

Nice! Now let's move on and add some descriptions for API users to know how to handle it. According to the [specification](https://swagger.io/specification/), we need to use the `openapi.yml` to add custom information:

1. Access `http://localhost:8080/swagger` and download `openapi.yml`
2. Save `openapi.yml` at `./src/main/resources/META-INF`
3. Add some descriptions and API info

Now you can access it again via http://localhost:8080/swagger-ui and check the result =D

## DockerHub

