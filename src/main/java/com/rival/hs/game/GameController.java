package com.rival.hs.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

@Controller
public class GameController {

    @Autowired
    GameMongoRepository gameMongoRepository;

    @RequestMapping(value="/game", method = RequestMethod.GET)
    public List<GameDo> index(@RequestParam(required = false) String city,@RequestParam(required = false) String type) {

        List<GameDo> t = gameMongoRepository.findByCityAndType(city,type);
        System.out.println(t.toString());

        return gameMongoRepository.findByCityAndType(city,type);
    }

    // 축구, 풋볼 게시판 가져오기
    @RequestMapping(value="/board", method = RequestMethod.GET)
    public String SoccerBoard(Model model, @RequestParam(value="type", required = false) String type){
        String soccer = "축구";
        String baseball = "야구";
        String basketball = "농구";
        String volleyfootball = "족구";
        String billiards = "당구";
        String bowing = "볼링";
        List<GameDo> board = gameMongoRepository.findByType(type);
      /*  for (GameDo types: board) {
            //축구
            if(soccer.equals(type)) {
                model.addAttribute("board",board);
                return "board";
            }
            //야구
            else if(baseball.equals(type)){
                model.addAttribute("board",board);
                return "board";
            }
            //농구
            else if(basketball.equals(type)){
                model.addAttribute("board",board);
                return "board";
            }
            //족구
            else if(volleyfootball.equals(type)){
                model.addAttribute("board",board);
                return "board";
            }
            //당구
            else if(billiards.equals(type)){
                model.addAttribute("board",board);
                return "board";
            }
            //볼링
            else if(bowing.equals(type)){
                model.addAttribute("board",board);
                return "board";
            }
        }*/
        model.addAttribute("board",board);
        return "board";
    }

    @RequestMapping(value="/save", method = RequestMethod.GET)
    public void save(
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String emblem,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String contents,
            @RequestParam(required = false) Integer people_num,
            @RequestParam(required = false) String stadium,
            @RequestParam(required = false) String time_game) {

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm");
        String now = dateFormat.format(cal.getTime());

        System.out.println(type+"\n"+city+"\n"+team+"\n"+emblem+"\n"+contents+"\n"+title+"\n"+people_num+"\n"+stadium+"\n"+now+"\n"+time_game);

        gameMongoRepository.save(new GameDo(type, city, team,emblem, contents, title, people_num, stadium, now, time_game));

        }
}
