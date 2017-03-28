package com.rival.hs.game;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

public interface GameMongoRepository extends MongoRepository<GameDo, String> {
    public List<GameDo> findByCity(String city);

    //public List<GameDo> find

}
