package com.rival.hs.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 18..
 */

@RestController
public class TeamController {


    @Autowired
    TeamMongoRepository teamMongoRepository;

    @RequestMapping(value="/team", method = RequestMethod.GET)
    public List<TeamDo> index(@RequestParam(required = false) String name) {

        List<TeamDo> t = teamMongoRepository.findByName(name);
        System.out.println(t.toString());

        return teamMongoRepository.findByName(name);
    }
}

