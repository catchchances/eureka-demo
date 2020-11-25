1. 注册服务器的运行方法  

    a. 单节点:  
    java -jar .\eureka-server-0.0.1-SNAPSHOT.jar  

    b. 双节点：  
    java -jar .\eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=eureka-server-1 --server.port=8761  
    java -jar .\eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=eureka-server-2 --server.port=8762  






