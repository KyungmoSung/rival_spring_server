package com.rival.hs.team;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Minwoo on 2017. 3. 18..
 */
@Document(collection = "TEAM_TB")
public class TeamDo {

    private String id;
    private String name;
    private String type;
    private String city;
    private String introduce;
    private String captain;
    private String emblem;
    private String image;

    public TeamDo() {


    }

    public TeamDo(String id, String name, String type, String city, String introduce, String captain, String emblem, String image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.city = city;
        this.introduce = introduce;
        this.captain = captain;
        this.emblem = emblem;
        this.image = image;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getEmblem() {
        return emblem;
    }

    public void setEmblem(String emblem) {
        this.emblem = emblem;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
