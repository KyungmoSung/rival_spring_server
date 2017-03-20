package com.rival.hs.game;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

@Document(collection = "GAME_TB")
public class GameDo {

    public String id;

    private String game_type;
    private String city;

    private String contents;

    private String title;
    private int people_num;

    private String stadium;
    private String time_update;
    private String time_game;

    public GameDo() {
    }


    public GameDo(String game_type, String city, String contents, String title, int people_num, String stadium, String time_update, String time_game) {
        this.game_type = game_type;
        this.city = city;
        this.contents = contents;
        this.title = title;
        this.people_num = people_num;
        this.stadium = stadium;
        this.time_update = time_update;
        this.time_game = time_game;
    }

    public String getGame_type() {
        return game_type;
    }

    public void setGame_type(String game_type) {
        this.game_type = game_type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPeople_num() {
        return people_num;
    }

    public void setPeople_num(int people_num) {
        this.people_num = people_num;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getTime_update() {
        return time_update;
    }

    public void setTime_update(String time_update) {
        this.time_update = time_update;
    }

    public String getTime_game() {
        return time_game;
    }

    public void setTime_game(String time_game) {
        this.time_game = time_game;
    }
}

