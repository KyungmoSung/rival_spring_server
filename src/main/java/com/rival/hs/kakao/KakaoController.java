package com.rival.hs.kakao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * Created by Minwoo on 2017. 3. 14..
 */

@Controller
public class KakaoController {

    @Autowired
    KakaoMongoRepository kakaoMongoRepository;

    @Autowired
    private KakaoDao dao;

    @RequestMapping(value="/kakao", method = RequestMethod.POST)
    public List<KakaoDo> index(@RequestBody String body) {


        System.out.println();

    }
    private KakaoAPI kakaoAPI = new KakaoAPI();

    private JsonParser jsonParser = new JsonParser();


    @RequestMapping(value="/kakao", method = RequestMethod.POST)
    public String kakao(@RequestBody KakaoDo body, ModelMap map, HttpSession httpSession) {

        ModelAndView mav = new ModelAndView("redirect:/index");



        body.setKakao_info(jsonParser.parse(kakaoAPI.send(body.getAccess_token())));

        //httpSession.setAttribute("UserLogin", body.getAccess_token());

        kakaoDao.save(body);

        return "index";
    }


    @RequestMapping(value="/kakaoInfo", method = RequestMethod.GET)
    public List<KakaoDo> kakaoInfo(@RequestParam(required = false) String _id) {


        List<KakaoDo> t = kakaoMongoRepository.findByKakaoId(_id);
        System.out.println(t.toString());

        return kakaoMongoRepository.findByKakaoId(_id);
    }

}
