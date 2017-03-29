package com.rival.hs;

import com.rival.hs.game.GameMongoRepository;
import com.rival.hs.kakao.KakaoMongoRepository;
import com.rival.hs.team.TeamMongoRepository;
import com.rival.hs.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@SpringBootApplication
public class SpringMvcApplication {



	@Autowired
	GameMongoRepository gameMongoRepository;
	TeamMongoRepository teamMongoRepository;
	KakaoMongoRepository kakaoMongoRepository;
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}
}