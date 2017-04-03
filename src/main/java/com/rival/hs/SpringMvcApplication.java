package com.rival.hs;

import com.rival.hs.match.MatchMongoRepository;
import com.rival.hs.kakao.KakaoMongoRepository;
import com.rival.hs.team.TeamMongoRepository;
import com.rival.hs.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;

@Configuration
@ComponentScan
@SpringBootApplication
public class SpringMvcApplication {



	@Autowired
	MatchMongoRepository matchMongoRepository;
	TeamMongoRepository teamMongoRepository;
	KakaoMongoRepository kakaoMongoRepository;
	UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);


	}


	@Bean
	public HttpMessageConverter<String> responseBodyConverter() {
		return new StringHttpMessageConverter(Charset.forName("UTF-8"));
	}
}