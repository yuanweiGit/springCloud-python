# springCloud-python
# 通过Sidecar可以实现SpringCloud和第三方应用程序的整合

服务的启动顺序：Python服务,eureka-server,sidecar-py,eureka-service

一:  Python服务:
  
  pip install Flask

  (1) Python服务监听3000接口。

  (2) health方法用于给Sidecar提供健康接口，用于实时向Sidecar提供自己的健康状态。

  (3) getMsg是Python向外界提供的服务，提供Python信息和状态。

二:  eureka-server服务：

  (1) 注册中心 http://localhost:8000/

三:  sidecar-py服务  http://localhost:8001/

  (1) 配置文件中sidecar.port 代表第三方程序运行的端口（比如上方的Python），所以监听端口为3000

  (2) 配置文件中sidecar.health-uri是Python健康接口，应指向python的健康服务

四: eureka-service服务

  ## （注意：在这里Java语言调用了Python的接口，实现了Java和Python的通信）
  
  (1) 在JavaController中，msg方法调用了Python服务，将Python中getMsg信息返回
  
    http://localhost:8002/msg
  
  (2) msg方法返回python中getMsg信息
