package com.rival.hs.kakao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 14..
 */

@RestController
public class KakaoController {

    @Autowired
    KakaoMongoRepository kakaoMongoRepository;

    @Autowired
    private KakaoDao dao;

    @RequestMapping(value="/kakao", method = RequestMethod.POST)
    public List<KakaoDo> index(@RequestBody String body) {


        System.out.println();

        return dao.listForBeanPropertyRowMapper();
    }


    @RequestMapping(value="/login_kakao", method = RequestMethod.POST)
    public List<KakaoDo> login_kakao(HttpServletRequest httpServletRequest, @RequestBody KakaoDo kakaodo){


        System.out.println("test");
        System.out.println(kakaodo.toString());


        return dao.listForBeanPropertyRowMapper();
    }

    @RequestMapping(value="/login_kakao", method = RequestMethod.GET)
    public List<KakaoDo> login_kakao_get(HttpServletRequest httpServletRequest, @RequestBody KakaoDo kakaodo){


        System.out.println("test");
        System.out.println(kakaodo.toString());


        return dao.listForBeanPropertyRowMapper();
    }


    @RequestMapping(value="/kakaoInfo", method = RequestMethod.GET)
    public List<KakaoDo> kakaoInfo(@RequestParam(required = false) String _id) {


        List<KakaoDo> t = kakaoMongoRepository.findByKakaoId(_id);
        System.out.println(t.toString());

        return kakaoMongoRepository.findByKakaoId(_id);
    }

}
