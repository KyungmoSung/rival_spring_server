package com.rival.hs.game;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

@Document(collection = "GAME_TB")
public class GameDo {

    @Id
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


}

