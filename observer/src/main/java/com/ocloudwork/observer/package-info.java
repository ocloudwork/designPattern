package com.ocloudwork.observer;
/**
 * jdk中的java.awt.Event,java.util.EventListener和其子接口相关的实现类
 * spring中的ContextLoaderListener,是jdk中java.util.EventListener的实现
 * 其他开源框架，有很多是实现java.util.EventListener来完成的
 * guava中的EventBus
 * 
 * 与发布订阅有区别：
 * 在观察者模式中，观察者是知道Subject的，Subject一直保持对观察者进行记录。然而，在发布订阅模式中，发布者和订阅者不知道对方的存在。它们只有通过消息代理进行通信。
 * 在发布订阅模式中，组件是松散耦合的，正好和观察者模式相反。
 * 观察者模式大多数时候是同步的，比如当事件触发，Subject就会去调用观察者的方法。而发布-订阅模式大多数时候是异步的（使用消息队列）。
 * 观察者 模式需要在单个应用程序地址空间中实现，而发布-订阅更像交叉应用模式。
 * 具体例子见发布订阅模式publishSubscribe
 */