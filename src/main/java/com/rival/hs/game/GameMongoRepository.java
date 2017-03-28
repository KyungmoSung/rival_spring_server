package com.rival.hs.game;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

public interface GameMongoRepository extends MongoRepository<GameDo, String> {

    @Query(value = "{ 'city' : ?0, 'type' : ?1 }")
    public List<GameDo> findByCityAndType(String city,String type);

    //public List<GameDo> find

}
