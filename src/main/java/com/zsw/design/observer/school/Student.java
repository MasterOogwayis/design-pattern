package com.zsw.design.observer.school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Shaowei Zhang on 2019/3/18 0:20
 **/
@Getter
@Setter
@AllArgsConstructor
public class Student implements Observer {

    private String name;

    @Override
    public void update(Observable o, Object arg) {
        Teacher teacher = (Teacher) o;
        System.out.println(this.name + ": " + teacher.getName() + " 布置了 " + arg + " 作业");
    }
}
