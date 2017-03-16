package com.rival.hs.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

@RestController
public class GameController {

    @Autowired
    private GameRepository dao;

    @RequestMapping(value="/game", method = RequestMethod.GET)
    public boolean game(@RequestBody String body) {

        //System.out.println(dao.findByDomain("user"));

        return false;
    }

}
