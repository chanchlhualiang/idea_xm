package com.chan;

/**
 * @ClassName User
 * @Description TODO
 * @Author Chan
 * @Date 2019/5/3 21:26
 * @Version 1.0
 **/
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String address;

    public User() {//hh
    }

    public User(Integer id, String name, Integer age, String sex, String address) {//C
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
}
