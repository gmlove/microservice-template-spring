## Intellj Setup

- Install google-java-format plugin
- Install CheckStyle-IDEA plugin
- Configure import orders to be 'static imports -- other imports -- java imports'

## Test environment setup

```
docker run --rm --name gc-mysql -e MYSQL_ROOT_PASSWORD=1111 -p14306:3306 -d mysql:5
mysql -uroot -p1111 -hai01 -P14306 -e "create database db_example;"
# To test:
curl -X POST -d 'name=test' -d 'email=email' localhost:8080/demo/users
curl localhost:8080/demo/users
curl localhost:8080/demo/users/1
```

## Features
- swagger
- actuator endpoints
- test coverage
- google checkstyle
- findbugs
- transaction
- logging
- db migration
- cloud config

## TODO:
- ascii doc
- json api spec
