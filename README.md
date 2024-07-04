# Getting Started

### Reference Documentation

```bash
./gradlew clean bootJar
```

Run chmod command when you get "./gradlew permission denied" error. 
```bash
chmod +x gradlew
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
