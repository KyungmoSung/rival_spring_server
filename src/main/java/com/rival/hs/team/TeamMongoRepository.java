package com.rival.hs.team;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 18..
 */
public interface TeamMongoRepository extends MongoRepository<TeamDo, String> {

    public List<TeamDo> findByName(String name);
    public List<TeamDo> findAll();
    //List<TeamDo> findByMember_id(int id);
    //public List<TeamDo> findByMember_id(String id);


    @Query(value = "{ 'city' : ?0, 'type' : ?1 }")
    List<TeamDo> findByCityAndType(String city,String type);

    //public List<TeamDo> findAll();

}