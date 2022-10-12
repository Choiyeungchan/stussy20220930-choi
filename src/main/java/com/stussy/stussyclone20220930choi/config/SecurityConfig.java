package com.stussy.stussyclone20220930choi.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.ObjectInputFilter;
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.httpBasic().disable();
        http.authorizeRequests()
                .antMatchers("/account/mypage", "/index")       //지정한 경로로 요청이 들어오면
                .authenticated()                                //인증을 거치게 함
                .anyRequest()                                   //다른 요청들이 들어오면
                .permitAll()                                    //전부 허용함
                .and()
                .formLogin()                                    //폼로그인에 대한 설정을 한다.
                .loginPage("/account/login")                    //로그인 페이지로 사용할 주소
                .defaultSuccessUrl("/index");
    }
}
