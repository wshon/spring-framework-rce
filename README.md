# spring-framework-rce
CVE-2022-22965

## 环境需求

1. tomcat8 <=8.5.77, tomcat9 <=9.0.60
2. jdk > 8

## 使用方法

1. 下载 [spring_framework_rce-0.0.1-SNAPSHOT.zip](https://github.com/wshon/spring-framework-rce/files/8398277/spring_framework_rce-0.0.1-SNAPSHOT.zip) 解压后，修改名称为 ROOT.war。
2. 替换掉 tomcat 内的 webapps 文件夹下的 ROOT 文件夹或 ROOT.war。
3. 切换到 tomcat 内的 bin 路径下，执行 .\catalina.bat run。

## 测试方法

略

## 结果

|jdk|tomcat|结果|
|---|------|----|
|jdk8u322-b06|apache-tomcat-8.5.77|安全|
|jdk8u322-b06|apache-tomcat-8.5.78|安全|
|jdk8u322-b06|apache-tomcat-9.0.60|安全|
|jdk-9.0.4+11|apache-tomcat-8.5.77|存在漏洞|
|jdk-9.0.4+11|apache-tomcat-8.5.78|安全（日志报错）|
|jdk-9.0.4+11|apache-tomcat-9.0.60|存在漏洞|
|jdk-11.0.14.1+1|apache-tomcat-8.5.77|存在漏洞|
|jdk-11.0.14.1+1|apache-tomcat-8.5.78|安全（日志报错）|
|jdk-11.0.14.1+1|apache-tomcat-9.0.60|存在漏洞|
