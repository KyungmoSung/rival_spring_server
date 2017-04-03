package com.rival.hs.user;

import com.rival.hs.game.GameDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017-03-18.
 */
@Controller
public class UserController {

    @Autowired
    UserRepository userMongoRepository;

    @ResponseBody
    @RequestMapping(value="/user", method = RequestMethod.GET)
    public List<UserDo> index(@RequestParam(required = false) String id, @RequestParam(required = false) String name) {

        if(name ==null)
            return userMongoRepository.findByUserid(id);
        else
            return userMongoRepository.findByName(name);
    }



}
