package com.rival.hs.game;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Minwoo on 2017. 3. 16..
 */
public interface GameRepository extends MongoRepository<GameDo, String> {

        public GameDo findByDomain(String domain);
}

