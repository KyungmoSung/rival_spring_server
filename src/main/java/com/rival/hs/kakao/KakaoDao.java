package com.rival.hs.kakao;

import com.rival.hs.game.GameDo;
import com.rival.hs.kakao.KakaoDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 14..
 */

@Repository
public interface KakaoDao extends MongoRepository<KakaoDo, String> {



}
