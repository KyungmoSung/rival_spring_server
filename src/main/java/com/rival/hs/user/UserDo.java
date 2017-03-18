package com.rival.hs.user;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by user on 2017-03-16.
 */

@Document(collection = "user")
public class UserDo {
    private String name;
    private String age;
    public UserDo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
