```
docker run --rm --name gc-mysql -e MYSQL_ROOT_PASSWORD=1111 -p14306:3306 -d mysql:5
mysql -uroot -p1111 -hai01 -P14306 -e "create database db_example;"
# To test:
curl -X POST -d 'name=test' -d 'email=email' localhost:8080/demo/users
curl localhost:8080/demo/users
curl localhost:8080/demo/users/1
```