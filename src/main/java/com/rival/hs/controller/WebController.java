package com.rival.hs.controller;

/**
 * Created by Sung on 2017. 3. 8..
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;
import java.util.*;

@Controller
public class WebController {


    @RequestMapping(value="/index")
    public String index() {

        return "index";
    }

    @RequestMapping(value="/test")
    public String test(Model model) {

        ArrayList<Object> test = new ArrayList<>();

        Float[] t1 = new Float[10];
        Float[] t2 = new Float[10];

        BufferedReader br = null;
        String line;
        String cvsSplitBy = ",";


        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/Minwoo/Downloads/8.csv"), "euc-kr"));
            while ((line = br.readLine()) != null) {
                String[] field = line.split(cvsSplitBy);

                if(field[0].contains("x좌표"))
                    continue;
                float a[] = {Float.valueOf(field[0]),Float.valueOf(field[1])};

                test.add(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        ModelAndView mav = new ModelAndView("test");
        mav.addObject("messages", "hello");
        model.addAttribute("messages", test);


        return "test";
    }


    @RequestMapping(value="/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value="/create")
    public String create(){return "register";}

    @RequestMapping(value="/team")
    public String team(){return "team";}

}
