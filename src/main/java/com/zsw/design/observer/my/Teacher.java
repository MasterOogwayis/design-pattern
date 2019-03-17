package com.zsw.design.observer.my;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Observable;

/**
 * @author Shaowei Zhang on 2019/3/18 0:19
 **/
@Getter
@Setter
@AllArgsConstructor
class Teacher extends Observable implements Homework {

    private String name;


    @Override
    public void setHomework(String homework) {
        super.setChanged();
        super.notifyObservers(homework);
        super.clearChanged();
    }
}
