package com.rival.hs.kakao;

/**
 * Created by Minwoo on 2017. 3. 14..
 */
public class KakaoDo {

    private int id;
    private String nick_name;
    private String profile_image;
    private String thumbnail_image;
    private String status;
    private String date;

    public KakaoDo(int id, String nick_name, String profile_image, String thumbnail_image, String status, String date) {
        this.id = id;
        this.nick_name = nick_name;
        this.profile_image = profile_image;
        this.thumbnail_image = thumbnail_image;
        this.status = status;
        this.date = date;
    }


}
