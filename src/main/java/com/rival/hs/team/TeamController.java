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

    @RequestMapping(value="/teamN", method = RequestMethod.GET)
    public List<TeamDo> name(@RequestParam(required = false) String name) {

        List<TeamDo> t = teamMongoRepository.findByName(name);
        System.out.println(t.toString());

        return teamMongoRepository.findByName(name);
    }

    @RequestMapping(value="/teamCT", method = RequestMethod.GET)
    public List<TeamDo> cityAndType(@RequestParam(required = false) String city,@RequestParam(required = false) String type) {

        List<TeamDo> t = teamMongoRepository.findByCityAndType(city,type);
        System.out.println(t.toString());

        return teamMongoRepository.findByCityAndType(city,type);
    }

}

