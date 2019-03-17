package com.zsw.design.observer.guava;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Shaowei Zhang on 2019/3/18 1:14
 **/
@Data
@AllArgsConstructor
public class Student implements Publisher {

    private String name;

    @Override
    public Question create(String question) {
        return new Question(this, question);
    }
}
