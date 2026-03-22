package com.arunit.interfaces;

/*
 Interfaces :
 -------------
Def1:Any service requirement specification(srs) is considered as an interface

ex1:JDBC API acts as requirement specification to develop database driver.database vendor is responsible to implement  this JDBC API.


                         SUN
                          |
                    +-------------+
                    |   JDBC API  |
                    +-------------+
                     /     |     \
                    /      |      \
                   /       |       \
                  /        |        \
                 /         |         \
        +-------------+  +-------------+  +-------------+
        |  Oracle     |  |   MySQL     |  |   DB2       |
        |  Driver     |  |   Driver    |  |   Driver    |
        +-------------+  +-------------+  +-------------+
        
        
 ex2:servelet api acts as requirement specification to develop web server .web server vendor is responsible to implement servelet API . web server vendor is responsible to implement servelet API
  
                    Sun Microsystems
                           |
                           v
                    +----------------+
                    |  Servlet API   |
                    +----------------+
                     /       |       \
                    /        |        \
                   v         v         v

        +----------------+  +---------------------+  +----------------------+
        | Apache Tomcat  |  | Oracle WebLogic     |  | IBM WebSphere        |
        | Server         |  | Server              |  | Server               |
        +----------------+  +---------------------+  +----------------------+

*/      

public class Introduction_01 {

}
