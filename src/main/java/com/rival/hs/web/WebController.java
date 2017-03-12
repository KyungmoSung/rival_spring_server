package com.rival.hs.web;

/**
 * Created by Sung on 2017. 3. 8..
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @Autowired
    @RequestMapping(value="/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value="/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value="/create")
    public String create(){return "register";}
}
