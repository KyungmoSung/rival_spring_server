package com.rival.hs.team;

import com.rival.hs.game.GameDo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 18..
 */
public interface TeamMongoRepository extends MongoRepository<TeamDo, String> {

    List<TeamDo> findByName(String name);


    @Query(value = "{ 'city' : ?0, 'type' : ?1 }")
    List<TeamDo> findByCityAndType(String city,String type);

    //public List<TeamDo> findAll();

}
