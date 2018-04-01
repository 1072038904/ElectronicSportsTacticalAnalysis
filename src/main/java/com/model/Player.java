package com.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: YuCheng
 * @Date: 2018/4/1/001 19:50
 * @Description:
 */
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    //选手名
    private String playerName;
    //选手所属战队
    @ManyToOne
    private Team team;
    //选手常用英雄
    @ManyToMany
    Set<Hero> heroSet = new HashSet<>();
}
