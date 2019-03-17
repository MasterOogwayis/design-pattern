package com.zsw.design.observer.guava;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 这是个问题
 *
 * @author Shaowei Zhang on 2019/3/18 1:05
 **/
@Data
@AllArgsConstructor
public class Question {

    private Student student;

    private String question;

}
