package com.wgwzhao.utils;

import java.io.Serializable;

/**
 * @author wgw
 * @date 2019/5/20 19:09
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -1507309368028494920L;

    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    private String name;
    private int age;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
