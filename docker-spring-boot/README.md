# ## 运行程序
## 使用 Maven

- 编译打包：

    mvn package

- 运行：

    java -jar target/docker-spring-boot-1.0.0.jar

- 访问项目

    如果程序正确运行，浏览器访问 http://localhost:8080/，可以看到页面 “Hello Docker World.” 字样。

-构建 Docker Image

    执行构建成为 docker image:

    mvn package docker:build
