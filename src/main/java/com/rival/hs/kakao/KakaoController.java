package com.rival.hs.kakao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


/**
 * Created by Minwoo on 2017. 3. 14..
 */

@Controller
public class KakaoController {

    @Autowired
    private KakaoDao kakaoDao;

    private KakaoAPI kakaoAPI = new KakaoAPI();

    private JsonParser jsonParser = new JsonParser();


    @RequestMapping(value="/kakao", method = RequestMethod.POST)
    public ModelAndView kakao(@RequestBody KakaoDo body, ModelMap map, HttpSession httpSession) {

        ModelAndView mav = new ModelAndView("redirect:/index");



        body.setKakao_info(jsonParser.parse(kakaoAPI.send(body.getAccess_token())));

        httpSession.setAttribute("UserLogin", body);


        kakaoDao.save(body);
        return mav;
    }
}
