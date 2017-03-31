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
     * @param String access_token              팀 뭐시기
     * @param String refresh_token          팀 뭐시기
     * @param String expires_in    팀 뭐시기
     * @param String scope    팀 뭐시기
     */

    private String team;
    private String access_token;
    private String token_type;
    private String refresh_token;
    private String expires_in;
    private String scope;
    private Kakao_info kakao_info;

    public KakaoDo() {
    }

    public KakaoDo(String access_token, String token_type, String refresh_token, String expires_in, String scope) {
        this.access_token = access_token;
        this.token_type = token_type;
        this.refresh_token = refresh_token;
        this.expires_in = expires_in;
        this.scope = scope;
    }


    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }



    public Kakao_info getKakao_info() {
        return kakao_info;
    }

    public void setKakao_info(Kakao_info kakao_info) {
        this.kakao_info = kakao_info;

    }
}

class Kakao_info {


    private String _id;
    private Kakao_properties kakao_properties;


    public Kakao_info(String _id, Kakao_properties kakao_properties) {
        this._id = _id;
        this.kakao_properties = kakao_properties;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Kakao_properties getKakao_properties() {
        return kakao_properties;
    }

    public void setKakao_properties(Kakao_properties kakao_properties) {
        this.kakao_properties = kakao_properties;
    }


    public String getId() {
        return _id;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getThumbnail_image() {
        return thumbnail_image;
    }

    public void setThumbnail_image(String thumbnail_image) {
        this.thumbnail_image = thumbnail_image;
    }


}
