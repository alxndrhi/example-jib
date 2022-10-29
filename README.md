# Example jib
This is an example project to play around with jib.

## Commands
Build and push BaseImage (docker):
```shell
docker buildx build --push --platform linux/arm64/v8,linux/amd64 --tag YOUR_IMAGE_NAME:latest . -f docker-images/BaseImage/Dockerfile
```

Build and push project:
```shell
./gradlew jib --image YOUR_IMAGE_NAME
```

Run it local:
```shell
docker run --rm -p 8080:8080 --name example-jib alxndrh/example-jib:latest
```

Check Service:
```shell
curl http://localhost:8080/actuator/health
```
