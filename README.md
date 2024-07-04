# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

```bash
./gradlew clean bootJar
```

```docker
 docker build -t my-spring-boot-app .
 ```

To see the docker image you have built
```docker
 docker images
 ```

```docker
 docker run -d -p 8080:8080 --name spring-boot-container my-spring-boot-app
 ```

To see the docker container you have run
```docker
 docker ps
 ```

```docker
 docker logs -f spring-boot-container
 ```