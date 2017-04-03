package com.rival.hs.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 18..
 */

@Controller
public class TeamController {


    @Autowired
    TeamMongoRepository teamMongoRepository;

    @ResponseBody
    @RequestMapping(value="/teamN", method = RequestMethod.GET)
    public List<TeamDo> name(@RequestParam(required = false) String name) {

        List<TeamDo> t = teamMongoRepository.findByName(name);
        System.out.println(t.toString());

        return teamMongoRepository.findByName(name);
    }

    @ResponseBody
    @RequestMapping(value="/teamCT", method = RequestMethod.GET)
    public List<TeamDo> cityAndType(@RequestParam(required = false) String city,@RequestParam(required = false) String type) {

        List<TeamDo> t = teamMongoRepository.findByCityAndType(city,type);
        System.out.println(t.toString());

        return teamMongoRepository.findByCityAndType(city,type);
    }

    @RequestMapping(value = "/team")
    public String TeamList(Model model,HttpSession session)
    {
        List<TeamDo> Buffer = new ArrayList<>();
        List<TeamDo> teamDoList =teamMongoRepository.findAll();
        String kakao_id = "385806550"; //땅현리 id 세션값  일단 이렇게 처리해두겠음
        for(int i=0;i<teamDoList.size();i++)
        {
            for(int j=0;j<teamDoList.get(i).getMember_id().size();j++) // 카카오 ID에 대해 팀 검사
            {
                if(kakao_id.equals(teamDoList.get(i).getMember_id().get(j)))
                {
                    Buffer.add(teamDoList.get(i));
                }
            }
        }
        model.addAttribute("MyteamList",Buffer);

        return "team";
    }

    @RequestMapping(value = "/team_make", method = RequestMethod.POST)
    public String newTeam(@Validated TeamDo form, BindingResult result, Model model, HttpSession session)throws ParseException {
        TeamDo teamdo = new TeamDo();
        teamdo.setName(form.getName());
        teamdo.setCaptain(form.getCaptain());
        teamdo.setCity(form.getCity());
        teamdo.setEmblem(form.getEmblem());
        teamdo.setImage(form.getImage());
        teamdo.setIntroduce(form.getIntroduce());
        teamdo.setType(form.getType());

        String kakao_id = (String) session.getAttribute("id"); //세션값. 수정해야됨 !!
        teamdo.setMember_id(kakao_id);

        teamMongoRepository.save(teamdo);
        return "redirect:/team";

    }

}

