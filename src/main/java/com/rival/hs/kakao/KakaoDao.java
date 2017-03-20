package com.rival.hs.kakao;

import com.rival.hs.kakao.KakaoDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 14..
 */

@Repository
public class KakaoDao {

    @Autowired
    private JdbcTemplate template;

    /**
     * Get hello list, using BeanPropertyRowMapper
     *
     * @return
     */
    public List<KakaoDo> listForBeanPropertyRowMapper() {
        String query = "SELECT * FROM KAKAO_ACCOUNT_TB";
        return template.query(query, new BeanPropertyRowMapper(KakaoDo.class));
    }

    /**
     * Insert hello
     *
     * @param kko
     * @return
     */
    public int insert(KakaoDo kko) {
        String query = "INSERT INTO hello(name, message) VALUES(?, ?)";

        //return template.update(query, kko.getName(), kko.getMessage());

        return 0;
    }

}
