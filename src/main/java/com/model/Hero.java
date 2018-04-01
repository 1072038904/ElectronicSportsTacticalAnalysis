package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: YuCheng
 * @Date: 2018/4/1/001 18:40
 * @Description:
 */
@Entity
public class Hero {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    //英雄名
    private String heroName;
}
