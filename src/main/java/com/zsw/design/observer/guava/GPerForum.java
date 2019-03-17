package com.zsw.design.observer.guava;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 论坛
 *
 * @author Shaowei Zhang on 2019/3/18 1:05
 **/
@Data
@AllArgsConstructor
public class GPerForum {

    private String title;

    private Question question;

}
