package com.rival.hs.web;

/**
 * Created by Sung on 2017. 3. 8..
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @Autowired
    @RequestMapping(value="/index")
    public String Index() {
        return "index";
    }

    @RequestMapping(value="/login")
    public String Login() {
        return "login";
    }

    @RequestMapping(value="/create")
    public String Create(){return "register";}

    @RequestMapping(value="/landing")
    public String Landing(){return "landing";}

    @RequestMapping(value="/generic")
    public String Generic(){return "generic";}

    @RequestMapping(value="/elements")
    public String Elements(){return "elements";}

}
