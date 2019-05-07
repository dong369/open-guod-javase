@echo off
chcp 65001
echo ****************************************
echo 安装行云SDK依赖包
echo ****************************************

call mvn install:install-file -DgroupId=etc.command -DartifactId=etc-commons-logging  -Dversion=1.2 -Dpackaging=jar -Dfile=etc-commons-logging-1.2.jar
call mvn install:install-file -DgroupId=etc.command -DartifactId=etc-httpclient  -Dversion=4.5 -Dpackaging=jar -Dfile=etc-httpclient-4.5.jar
call mvn install:install-file -DgroupId=etc.command -DartifactId=etc-httpcore  -Dversion=4.4 -Dpackaging=jar -Dfile=etc-httpcore-4.4.jar
call mvn install:install-file -DgroupId=etc.command -DartifactId=etc-httpmime  -Dversion=4.5 -Dpackaging=jar -Dfile=etc-httpmime-4.5.jar
call mvn install:install-file -DgroupId=etc.command -DartifactId=etc-jackson-annotations  -Dversion=2.8 -Dpackaging=jar -Dfile=etc-jackson-annotations-2.8.jar
call mvn install:install-file -DgroupId=etc.command -DartifactId=etc-jackson-core  -Dversion=2.8 -Dpackaging=jar -Dfile=etc-jackson-core-2.8.jar
call mvn install:install-file -DgroupId=etc.command -DartifactId=etc-jackson-databind  -Dversion=2.8 -Dpackaging=jar -Dfile=etc-jackson-databind-2.8.jar
call mvn install:install-file -DgroupId=etc.command -DartifactId=etc-jackson-datatype-jsr310  -Dversion=2.8 -Dpackaging=jar -Dfile=etc-jackson-datatype-jsr310-2.8.jar
call mvn install:install-file -DgroupId=etc.command -DartifactId=slf4j-api  -Dversion=1.7 -Dpackaging=jar -Dfile=slf4j-api-1.7.jar

call mvn install:install-file -DgroupId=etc.command -DartifactId=sdk-common  -Dversion=1.0 -Dpackaging=jar -Dfile=sdk-common-1.0.jar
call mvn install:install-file -DgroupId=cn.com.taiji -DartifactId=sdk-b2b-protocol  -Dversion=1.3 -Dpackaging=jar -Dfile=sdk-b2b-protocol-1.3.jar
call mvn install:install-file -DgroupId=cn.com.taiji -DartifactId=sdk-b2c-protocol  -Dversion=1.0.1 -Dpackaging=jar -Dfile=sdk-b2c-protocol-1.0.1.jar

pause