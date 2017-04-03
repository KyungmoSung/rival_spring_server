package com.rival.hs.stadium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Minwoo on 2017. 3. 29..
 */

@RestController
public class StadiumController {


    @Autowired
    StadiumMongoRepository stadiumMongoRepository;

    @RequestMapping("/stadium")
    public void stadium() {



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
