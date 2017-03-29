package com.rival.hs.stadium;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Minwoo on 2017. 3. 29..
 */
public interface StadiumDao extends MongoRepository<StadiumDo, String> {

}
