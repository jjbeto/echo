[![](https://github.com/jjbeto/echo/workflows/Publish/badge.svg)](https://github.com/jjbeto/echo/workflows/Publish/badge.svg)
[![GitHub issues](https://img.shields.io/github/issues-raw/jjbeto/echo?style=flat)](https://github.com/jjbeto/echo/issues)
[![GitHub pull requests](https://img.shields.io/github/issues-pr/jjbeto/echo)](https://github.com/jjbeto/echo/pulls)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# Echo server

A simple REST endpoint that return the same text provided as parameter. It's also possible to ask for a waiting time to get responses.

## TechStack

| Stack    |
| -------- |
| Quarkus  |
| RestEasy |
| Swagger  |
| Docker   |

## How to create this project?

Please take a look at my [blog](https://jjbeto.com/blog/2019/12/07/build-native-app-with-quarkus/) to get all details and steps to have this sample project running.

## DockerHub

You can pull this project directly from [DockerHub](https://hub.docker.com/r/jjbeto/echo):

```bash
docker pull jjbeto/echo
```

Or by trying to run the container directly:

```bash
docker run -i --rm -p 8080:8080 jjbeto/echo
```
