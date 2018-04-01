package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: YuCheng
 * @Date: 2018/4/1/001 21:01
 * @Description:
 */
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    //战队名
    private String teamName;

}
