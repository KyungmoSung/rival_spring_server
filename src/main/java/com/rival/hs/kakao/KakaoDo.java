package com.rival.hs.kakao;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


/**
 * Created by Minwoo on 2017. 3. 14..
 */

@Document(collection = "USER_TB")
public class KakaoDo {

    /**
     * @author MinwooPark<pmw9027@outlook.kr>
     * @param String team              팀 뭐시기
     * @param String kakao_id          팀 뭐시기
     * @param String kakao_nickname    팀 뭐시기
     */


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
class Kakao_info {
    private String id;
    private Kakao_properties kakao_properties;

    public Kakao_info(String id, Kakao_properties kakao_properties) {
        this.id = id;
        this.kakao_properties = kakao_properties;
    }

}
class Kakao_properties {
    private String nickname;
    private String profile_image;
    private String thumbnail_image;

    public Kakao_properties(String nickname, String profile_image, String thumbnail_image) {
        this.nickname = nickname;
        this.profile_image = profile_image;
        this.thumbnail_image = thumbnail_image;
    }
}
