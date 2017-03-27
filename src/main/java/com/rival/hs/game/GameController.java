package com.rival.hs.game;

import com.rival.hs.kakao.KakaoDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

@RestController
public class GameController {

    @Autowired
    GameMongoRepository gameMongoRepository;

    @RequestMapping(value="/game", method = RequestMethod.GET)
    public List<GameDo> index(@RequestParam(required = false) String city,@RequestParam(required = false) String type) {

        List<GameDo> t = gameMongoRepository.findByCityAndType(city,type);
        System.out.println(t.toString());

        return gameMongoRepository.findByCityAndType(city,type);
    }


    @RequestMapping(value="/save", method = RequestMethod.GET)
    public void save(
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String contents,
            @RequestParam(required = false) Integer people_num,
            @RequestParam(required = false) String stadium,
            @RequestParam(required = false) String time_game) {

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm");
        String now = dateFormat.format(cal.getTime());

        System.out.println(type+"\n"+city+"\n"+team+"\n"+contents+"\n"+title+"\n"+people_num+"\n"+stadium+"\n"+now+"\n"+time_game);

        gameMongoRepository.save(new GameDo(type, city, team, contents, title, people_num, stadium, now, time_game));

        }


}
