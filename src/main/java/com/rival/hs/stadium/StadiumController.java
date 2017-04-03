package com.rival.hs.stadium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 29..
 */

@Controller
public class StadiumController {


    @Autowired
    StadiumMongoRepository stadiumMongoRepository;


    @ResponseBody
    @RequestMapping(value="/stadium", method = RequestMethod.GET)
    public List<StadiumDo> index(@RequestParam(required = false) String type) {
        System.out.println(type);
        return stadiumMongoRepository.findByType(type);
    }


    @RequestMapping("/stadiumapi")
    public void stadium2() {

        StadiumAPI stadiumAPI = new StadiumAPI();

        StadiumXMLParser stadiumXMLParser = new StadiumXMLParser();

        ArrayList<StadiumDo> arrayList = new ArrayList<>();

        try {
            int i =3465;
            do {

                arrayList = stadiumXMLParser.parser(stadiumAPI.send(i++));
                stadiumMongoRepository.save(arrayList);


            } while(arrayList.size() > 0);


        } catch (Exception e) {

            System.out.println(e.getMessage());
        }



    }
}
