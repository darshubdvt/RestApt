/*
 * package com.evolvusion.rest.restapi.security;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SpringSecurityRest extends
 * WebSecurityConfigurerAdapter{
 * 
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { http
 * .authorizeRequests() .antMatchers("/css/**", "/index").permitAll()
 * .antMatchers("/user/**").hasRole("USER") .and() .formLogin()
 * .loginPage("/login").failureUrl("/login-error"); }
 * 
 * 
 * @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
 * throws Exception { auth .inMemoryAuthentication()
 * .withUser("darshans").password("root").roles("admin"); }
 * 
 * }
 */