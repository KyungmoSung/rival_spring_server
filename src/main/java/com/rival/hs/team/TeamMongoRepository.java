package com.rival.hs.team;

import com.rival.hs.game.GameDo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 18..
 */
public interface TeamMongoRepository extends MongoRepository<TeamDo, String> {

    public List<TeamDo> findByName(String name);

    //public List<TeamDo> findAll();

}
