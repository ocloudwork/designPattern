package com.ocloudwork.strategy;
/**
行为型
定义：策略模式定义了一系列的算法，并将每一个算法封装起来，而且使他们可以相互替换，
让算法独立于使用它的客户而独立变化。

使用场景：
1.针对同一类型问题的多种处理方式，仅仅是具体行为有差别时； 
2.需要安全地封装多种同一类型的操作时； 
3.出现同一抽象类有多个子类，而又需要使用 if-else 或者 switch-case 来选择具体子类时。

缺点：
1.客户端必须知道所有的策略类，并自行决定使用哪一个策略类
2.产生很多策略实现类

相关设计模式：
工厂模式，策略工厂
状态模式

源码中的策略模式：
java.util.Comparator
java.util.TreeMap
org.springframework.core.io.Resource
org.springframework.beans.factory.support.InstantiationStrategy
 */
