1,请下载Tomcat7（http://pan.baidu.com/s/1pJr2jNl）

2,请下载redis（http://pan.baidu.com/s/1dFBFw）

3,请下载mongodb,然后配置好。

4,请还原项目目录/db/下的数据库文件，请选择最近日期的.sql文件还原，数据库是mysql5

5,请新建一个动态web项目，将源码复制到您的项目，然后修改src/database配置文件,将数据库连接信息改成你本机的。（该步骤仅在无法编译项目时使用,一般情况下直接导入工程即可）

6,请确认配置了Tomcat7虚拟目录指向你的工程目录的webcontent下。

7,启动redis服务

8,启动mongodb服务

9,以上步骤你都完成了，既可以登陆后台yourproject/admin/login.jsp
