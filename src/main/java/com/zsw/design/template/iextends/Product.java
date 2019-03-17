package com.zsw.design.template.iextends;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Shaowei Zhang on 2019/3/17 16:49
 **/
@Data
@Builder
public class Product implements Serializable {
    private static final long serialVersionUID = -4394015046828318491L;


    private Long id;

    private String name;

    private String desc;

    private Integer number;

}
