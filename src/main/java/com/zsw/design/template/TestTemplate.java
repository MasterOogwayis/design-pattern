package com.zsw.design.template;

import com.zsw.design.template.iinterface.*;

/**
 * 模板模式
 * <p>
 * 定义一组算法，子类可以参与其中自己实现一个或多个步骤，但是顺序不可改变
 *
 * @author Shaowei Zhang on 2019/3/17 14:41
 **/
public class TestTemplate {

    public static void main(String[] args) {

        // 1. 继承的模板方法
//        ProductRepository productRepository = new ProductRepository(null);
//        List<Product> all = productRepository.findAll();
//        all.forEach(System.out::println);

        // 2. 尝试接口方式的模板模式？
        PizzaShop shop = new PizzaShop(
                new Cooker() {
                },
                new Oven() {
                },
                new Waiter() {
                }
        );

        Pizza pizza = shop.order();
        System.out.println(pizza);

        shop = new PizzaShop(
                new Cooker() {
                    @Override
                    public Pizza create() {
                        CheesePizza p = new CheesePizza();
                        p.name("牛肉");
                        return p;
                    }
                },
                new Oven() {
                    @Override
                    public void bake(Pizza pizza) {
                        pizza.bake("250℃ 烤一小时");
                    }
                },
                new Waiter() {
                    @Override
                    public void cut(Pizza pizza) {
                        pizza.cut("不切");
                    }

                    @Override
                    public void box(Pizza pizza) {
                        pizza.box("标准纸盒装");
                    }
                }
        );

        pizza = shop.order();
        System.err.println(pizza);

    }

}
