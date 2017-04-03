package com.rival.hs.match;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

@Controller
public class MatchController {

    @Autowired
    MatchMongoRepository matchMongoRepository;

    @RequestMapping(value="/game", method = RequestMethod.GET)
    @ResponseBody
    public List<MatchDo> index(@RequestParam(required = false) String city, @RequestParam(required = false) String type) {


        return matchMongoRepository.findByCityAndType(city, type);
    }

    // 축구, 풋볼 게시판 가져오기
    @RequestMapping(value="/matching", method = RequestMethod.GET)
    public String SportBoard(Model model, @RequestParam(value="type", required = false) String type, Pageable pageable){

        System.out.println(type);
        Page<MatchDo> board = matchMongoRepository.findByType(type, pageable);

        model.addAttribute("board",board);
        model.addAttribute("title",type);

        return "matching";
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

        matchMongoRepository.save(new MatchDo(type, city, team,emblem, contents, title, people_num, stadium, now, time_game));

        }
}
