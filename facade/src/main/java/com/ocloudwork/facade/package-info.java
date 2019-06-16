package com.ocloudwork.facade;
/**
 * 外观模式是迪米特法则的典型体现
 * 版本控制，可以通过抽象外观类达到多个版本并存（多个版本的外观类）
 * 源码：
 * spring-jdbc的JdbcUtils
 * mybatis的Configuration newMetaObject
 * tomcat源码中RequestFacade,Request
 * tomcat大量使用了外观类，可搜索Facade结尾的
 */