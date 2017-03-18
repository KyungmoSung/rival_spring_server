package com.rival.hs.game;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface GameMongoRepository extends MongoRepository<GameDo, String> {

    public GameDo findById(String id);

}
