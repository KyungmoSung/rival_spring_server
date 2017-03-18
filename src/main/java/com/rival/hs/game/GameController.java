package com.rival.hs.game;

import com.rival.hs.kakao.KakaoDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

@RestController
public class GameController {

    @Autowired
    GameMongoRepository gameMongoRepository;

    @RequestMapping(value="/game", method = RequestMethod.GET)
    public GameDo index() {



        return new GameDo();
    }
}
