package com.rival.hs.kakao;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


/**
 * Created by Minwoo on 2017. 3. 14..
 */

@Document(collection = "USER_TB")
public class KakaoDo {

    private String team;

    @Field("kakao_info._id")
    private  String kakao_id;


    @Field("kakao_info.kakao_properties.nickname")
    private  String kakao_nickname;


    @Field("kakao_info.kakao_properties.profile_image")
    private  String kakao_profile_image;


    @Field("kakao_info.kakao_properties.thumbnail_image")
    private  String kakao_thumbnail_image;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getKakao_id() {
        return kakao_id;
    }

    public void setKakao_id(String kakao_id) {
        this.kakao_id = kakao_id;
    }

    public String getKakao_nickname() {
        return kakao_nickname;
    }

    public void setKakao_nickname(String kakao_nickname) {
        this.kakao_nickname = kakao_nickname;
    }

    public String getKakao_profile_image() {
        return kakao_profile_image;
    }

    public void setKakao_profile_image(String kakao_profile_image) {
        this.kakao_profile_image = kakao_profile_image;
    }

    public String getKakao_thumbnail_image() {
        return kakao_thumbnail_image;
    }

    public void setKakao_thumbnail_image(String kakao_thumbnail_image) {
        this.kakao_thumbnail_image = kakao_thumbnail_image;
    }
}
