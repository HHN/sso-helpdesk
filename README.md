# SSO Helpdesk

## Update `git submodules`

You can update the associated submodules by using 

```bash
git submodule update --remote
```

## Overriding application properties

To run the helpdesk application, you have to override properties defined in `application.properties`.
To do so, you can adjust them as needed in the `docker-compose.yml`.

## Building behind a proxy

To run the docker build behind a web proxy, you can run

```bash
docker compose build --build-arg "HTTP_PROXY=$HTTP_PROXY" --build-arg "HTTPS_PROXY=$HTTPS_PROXY" --build-arg "http_proxy=$HTTP_PROXY" --build-arg "https_proxy=$HTTPS_PROXY" --no-cache
```