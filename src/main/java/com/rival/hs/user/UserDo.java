package com.rival.hs.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by user on 2017-03-16.
 */

@Document(collection = "user_tb")
public class UserDo {

    private String id;
    private String userid;
    private String name;
    private int age;


    public UserDo(String userid, String name, int age) {
        this.userid = userid;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getUserid() {
        return userid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public UserDo() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "UserDo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
