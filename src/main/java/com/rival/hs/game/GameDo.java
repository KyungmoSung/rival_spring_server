package com.rival.hs.game;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

@Document(collection = "user")
public class GameDo {

    @Id
    public String id;
    private String game;
    private String title;
    private Date date;
    private int people_num;
    private String city;
    private String stadium;
    private String team_name;


    public GameDo() {
    }

    public GameDo(String game, String title, Date date, int people_num, String city, String stadium, String team_name) {
        this.game = game;
        this.title = title;
        this.date = date;
        this.people_num = people_num;
        this.city = city;
        this.stadium = stadium;
        this.team_name = team_name;
    }
}

