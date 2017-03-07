package com.rival.hs;

/**
 * Created by Sung on 2017. 3. 8..
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WebController {

    @RequestMapping("/")
    public String hello() {
        return "hello! Spring Boot!";
    }

}