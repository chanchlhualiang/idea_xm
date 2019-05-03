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

    //H添加了setter方法
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
