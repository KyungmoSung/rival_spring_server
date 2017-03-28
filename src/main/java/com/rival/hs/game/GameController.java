package com.rival.hs.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

@Controller
public class GameController {

    @Autowired
    GameMongoRepository gameMongoRepository;

    @RequestMapping(value="/game", method = RequestMethod.GET)
    public List<GameDo> index(@RequestParam(required = false) String city) {

        List<GameDo> t = gameMongoRepository.findByCity(city);
        System.out.println(t.toString());

        return gameMongoRepository.findByCity(city);
    }

    // 축구, 풋볼 게시판 가져오기
    @RequestMapping(value="/soccer")
    public String SoccerBoard(Model model, @RequestParam(required = false) String game_type){
        String soccer = "축구";
        String baseball = "야구";
        String basketball = "농구";
        String volleyfootball = "족구";
        String billiards = "당구";
        String bowing = "볼링";
        List<GameDo> board = gameMongoRepository.findByType(game_type);
        board.forEach();
        model.addAttribute("soccerboard", board);
        return "soccer";

//        if(baseball.equals(game_type)){
//            model.addAttribute("soccerboard",board);
//            return "soccer";
//        }


    }
}
