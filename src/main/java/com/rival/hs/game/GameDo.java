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
    private String title;
    private int people_num;


    public GameDo() {
    }

    public GameDo(String id, String title, int people_num) {
        this.id = id;
        this.title = title;
        this.people_num = people_num;
    }

    @Override
    public String toString() {
        return "GameDo{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", people_num=" + people_num +
                '}';
    }
}

