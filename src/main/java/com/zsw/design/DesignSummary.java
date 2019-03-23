package com.zsw.design;

/**
 * 设计模式总结
 *
 * @author Shaowei Zhang on 2019/3/23 23:14
 **/
public class DesignSummary {


    /**
     * @see com.zsw.design.adapter.TestAdapter
     * 1. 适配器模式 adapter ,作为两个不兼容的接口之间的桥梁,将一个类的接口转换成客户希望的另外一个接口
     * @see com.zsw.design.decorator.TestDecorator
     * 2. 装饰器模式 decorator, 允许向一个现有的对象添加新的功能，同时又不改变其结构
     *    动态地给一个对象添加一些额外的职责，和静态代理最大的区别是他可以不改变代码动态扩展功能
     *    is - a
     * @see com.zsw.design.delegate.TestDelegate
     * 3. 委派模式 delegate，客户端不需要知道怎么做，交给代理选择
     * @see com.zsw.design.factory.SimpleFactoryTest
     * 4. 简单工厂模式 simple factory,由一个工厂类，通过传入参数 或者直接提供创建对象的方法创建类
     * @see com.zsw.design.factory.FactoryMethodTest
     *    工厂方法模式 factory method, 定义一个用于创建对象的接口，让子类决定实例化哪一个类
     * @see com.zsw.design.factory.AbstractFactoryTest
     *    抽象工厂模式 abstract factory，创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类.超级工厂
     * @see com.zsw.design.observer.guava.TestGuavaObserver
     * @see com.zsw.design.observer.my.TestMyObserver
     * 5. 观察者模式 observer，一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
     * @see com.zsw.design.prototype.TestPrototype
     * 6. 原型模式 prototype，用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。 clone
     * @see com.zsw.design.proxy.TestJdkProxy
     * @see com.zsw.design.proxy.TestCglibProxy
     * @see com.zsw.design.proxy.TestStaticProxy
     * 7. 代理模式 proxy，为其他对象提供一种代理以控制对这个对象的访问。
     *    has - a
     * @see com.zsw.design.singleton.LazyTargetTest
     * @see com.zsw.design.singleton.SafeSingletonTest
     * @see com.zsw.design.singleton.BreakSingletonTest
     * @see com.zsw.design.singleton.SafeTarget
     * 8. 单例模式 singleton，保证一个类仅有一个实例，并提供一个访问它的全局访问点
     * @see com.zsw.design.strategy.TestStrategy
     * 9. 策略模式 strategy，定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。由客户端选择使用哪一个
     * @see com.zsw.design.template.TestTemplate
     * 10. 模板模式 template，操作中的算法的骨架，将一些步骤延迟到子类中（子类可以参与其中几个步骤，但是不能改变方流程顺序）
     *
     *
     * @param args
     */
    public static void main(String[] args) {

    }

}
