package com.rival.hs;

import com.rival.hs.game.GameMongoRepository;
import com.rival.hs.kakao.KakaoMongoRepository;
import com.rival.hs.stadium.StadiumMongoRepository;
import com.rival.hs.team.TeamMongoRepository;
import com.rival.hs.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jersey.JerseyProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

import java.nio.charset.Charset;

@Configuration
@ComponentScan
@SpringBootApplication
public class SpringMvcApplication {



	@Autowired
	GameMongoRepository gameMongoRepository;
	TeamMongoRepository teamMongoRepository;
	KakaoMongoRepository kakaoMongoRepository;
	UserRepository userRepository;

	@Autowired
	StadiumMongoRepository stadiumMongoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);




	}



	@Bean
	public HttpMessageConverter<String> responseBodyConverter() {
		return new StringHttpMessageConverter(Charset.forName("UTF-8"));
	}
}