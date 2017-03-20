package com.rival.hs.kakao;

import groovy.transform.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Minwoo on 2017. 3. 14..
 */

@Document(collection = "USER_TB")
public class KakaoDo {

    private String access_token;
    private String token_type;
    private String refresh_token;
    private String expires_in;
    private String scope;

    public KakaoDo() {
    }

    public KakaoDo(String access_token, String token_type, String refresh_token, String expires_in, String scope) {
        this.access_token = access_token;
        this.token_type = token_type;
        this.refresh_token = refresh_token;
        this.expires_in = expires_in;
        this.scope = scope;
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
}
