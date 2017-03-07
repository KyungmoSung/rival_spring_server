package com.rival.hs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HeeJoongKim on 2017-03-07.
 */
@org.springframework.stereotype.Controller
@RequestMapping("")
class Controller {
    @Autowired

    @RequestMapping(value="login")
    String Login(){
        return "Login";
    }
}
