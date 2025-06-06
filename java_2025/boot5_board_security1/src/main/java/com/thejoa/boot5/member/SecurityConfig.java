package com.thejoa.boot5.member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration // 스프링부트 환경설정파일
@EnableWebSecurity // url 스프링시큐리티 제어 - SecurityFilterChain이 포함되어있다
public class SecurityConfig {
	//1. url
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		// 1-1. 로그인을 안하더라도 모든페이지 접근가능
		//		/admin/**,  /user/**,,,
		http.authorizeHttpRequests(
				(authorizeHttpRequests) -> authorizeHttpRequests
												//admin만 접근가능
												//.requestMatchers( new AntPathRequestMatcher("/admin/**")) //모든경로 요청 가능
												//.hasRole("ROLE_ADMIN")
												//member만 접근가능
												//.requestMatchers( new AntPathRequestMatcher("/member/**")) //모든경로 요청 가능
												//.hasRole("ROLE_MEMBER")
												// 기타페이지 모두 접근가능 ( 로그인 필요 없음 )
												.requestMatchers( new AntPathRequestMatcher("/**")) //모든경로 요청 가능
												.permitAll() //로그인 안한 상태에서 모든 권한 허용 
				
				).formLogin( //1-2. form 만든폼 - login
				(formLogin) -> 	formLogin.loginPage("/member/login")
										 .defaultSuccessUrl("/member/member")
				).logout(  // 1-3. logout 
						(logout) -> logout
										.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
										.logoutSuccessUrl("/member/login")
										.invalidateHttpSession(true)
				);
		
		// 1-2. form 만든 폼
		// 1-3. logout 
		return http.build(); //http.build() 사용자 로그인 반영
	}
	//2. AuthenticationManager - 사용자인증시 Service와 PasswordEncoder를 사용함
	@Bean
	AuthenticationManager authenticationManager(
			AuthenticationConfiguration authenticationConfiguration
			) throws Exception{
		return authenticationConfiguration.getAuthenticationManager();
	}
	
	
	//3. PasswordEncoder - 비번암호화
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}

//Bean - 스프링이 관리하는 객체