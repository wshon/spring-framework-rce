# spring-framework-rce
CVE-2022-22965

## 环境需求：

1. tomcat8 <=8.5.77, tomcat9 <=9.0.60
2. jdk > 8

## 使用方法：

1. 下载 [spring_framework_rce-0.0.1-SNAPSHOT.zip](https://github.com/wshon/spring-framework-rce/files/8398277/spring_framework_rce-0.0.1-SNAPSHOT.zip) 解压后，修改名称为 ROOT.war。
2. 替换掉 tomcat 内的 webapps 文件夹下的 ROOT 文件夹或 ROOT.war。
3. 切换到 tomcat 内的 bin 路径下，执行 .\catalina.bat run。

## 测试方法：

略
