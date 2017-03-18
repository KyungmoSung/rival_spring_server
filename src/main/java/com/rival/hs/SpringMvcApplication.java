package com.rival.hs;

import com.rival.hs.game.GameDo;
import com.rival.hs.game.GameMongoRepository;
import com.rival.hs.user.UserDo;
import com.rival.hs.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication

public class SpringMvcApplication  implements CommandLineRunner {

	@Autowired
	GameMongoRepository gameMongoRepository;
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



		//userRepository.save(new UserDo("tkd","park",25));

	}

}


