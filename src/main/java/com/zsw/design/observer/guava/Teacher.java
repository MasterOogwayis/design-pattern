package com.zsw.design.observer.guava;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Shaowei Zhang on 2019/3/18 1:16
 **/
@Data
@AllArgsConstructor
public class Teacher implements Subscriber {

    private String name;

    @Override
    public void action(GPerForum forum) {
        System.out.println(this.name + " 老师你好！");
        System.out.println("学号 " + forum.getQuestion().getStudent().getName() + " 的同学提出了问题《" + forum.getQuestion().getQuestion() + "》，需要你解答。");
    }
}
