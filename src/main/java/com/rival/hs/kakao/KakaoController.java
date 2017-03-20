package com.rival.hs.kakao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 14..
 */

@Controller
public class KakaoController {

    @Autowired
    private KakaoDao kakaoDao;

    @RequestMapping(value="/kakao", method = RequestMethod.POST)
    public String kakao(@RequestBody KakaoDo body, ModelMap map) {



        kakaoDao.save(body);

        return "index";
    }
}
