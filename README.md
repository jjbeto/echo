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
