package com.rival.hs.stadium;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Minwoo on 2017. 4. 1..
 */
public interface StadiumMongoRepository extends MongoRepository<StadiumDo, String> {

    public List<StadiumDo> findByType(String type);

}
