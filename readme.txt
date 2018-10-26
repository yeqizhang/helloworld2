一个最简单的集成数据库、使用jsp的spingboot web项目。实际自己使用时可以解压打包文件修改jsp和配置数据内容。也可获取源码修改。

端口默认：8080
context-path: helloworld

两个访问路径： 
http://localhost:8080/helloworld/index
http://localhost:8080/helloworld/list 

日志记录在data/logs下。主要是切面拦截的web访问日志。  

--------------------------------------------------
将程序打包后，放到目录如下
C:.
│  run(使用内部配置&使用系统环境jre).bat
│  run(使用内部配置).bat
│  run(使用外部配置).bat
│  runNoDb(使用内部配置&使用系统环境jre) - 副本.bat
│  
├─config
│      my.properties
│      （使用读内部的bat会优先读到这个）application.properties
│      
├─data
│  ├─db
│  │      db.sql
│  │      
│  └─logs
│          springboot-log4j-all.log
│          springboot-log4j-my.log
│          
└─package
    │  helloworld2-0.0.1-SNAPSHOT.jar
    │  
    └─jre
使用批处理文件。
@echo off
set path=%cd%\package\jre\bin
start java -jar package/helloworld2-0.0.1-SNAPSHOT.jar

也可使用自己的配置文件：
java -jar -Dspring.config.location=config/my.properties package/helloworld2-0.0.1-SNAPSHOT.jar


