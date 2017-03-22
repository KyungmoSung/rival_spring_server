package com.rival.hs.kakao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Minwoo on 2017. 3. 14..
 */

@Controller
public class KakaoController {

    @Autowired
    private KakaoDao kakaoDao;

    private KakaoAPI kakaoAPI = new KakaoAPI();

    @RequestMapping(value="/kakao", method = RequestMethod.POST)
    public String kakao(@RequestBody KakaoDo body, ModelMap map) {


        System.out.println(kakaoAPI.send(body.getAccess_token()));


        kakaoDao.save(body);

        return "index";
    }
}
