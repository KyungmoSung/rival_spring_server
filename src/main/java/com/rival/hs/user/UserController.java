package com.rival.hs.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by user on 2017-03-18.
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userMongoRepository;
    @RequestMapping(value="/user", method = RequestMethod.GET)
    public List<UserDo> index(@RequestParam(required = false) String id, @RequestParam(required = false) String name) {

        if(name ==null)
            return userMongoRepository.findByUserid(id);
        else
            return userMongoRepository.findByName(name);
    }



}
