//package com.sudeep.security.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;
//import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.security.web.csrf.CsrfTokenRepository;
//
//@Configuration
//public class AppSecurityConfig {
//
////	@Bean
////	public UserDetailsManager users(DataSource dataSource) {
////		UserDetails user = User.withDefaultPasswordEncoder().username("chitti").password("password123").roles("USER")
////				.build();
////		JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
////		users.createUser(user);
////		return users;
////	}
//	
//	 @Bean
//	    public PasswordEncoder passwordEncoder() {
//	        DelegatingPasswordEncoder encoder = (DelegatingPasswordEncoder) PasswordEncoderFactories.createDelegatingPasswordEncoder();
//	        encoder.setDefaultPasswordEncoderForMatches(PasswordEncoderFactories.createDelegatingPasswordEncoder());
//	        return encoder;
//	    }
//
//	    @Bean
//	    public CsrfTokenRepository csrfTokenRepository() {
//	        return CookieCsrfTokenRepository.withHttpOnlyFalse();
//	    }
//
//	    @Bean
//	    public LogoutSuccessHandler logoutSuccessHandler() {
//	        return new HttpStatusReturningLogoutSuccessHandler();
//	    }
//
//	    @Bean
//	    public SavedRequestAwareAuthenticationSuccessHandler authenticationSuccessHandler() {
//	        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
//	        successHandler.setTargetUrlParameter("redirectTo");
//	        successHandler.setDefaultTargetUrl("/");
//	        return successHandler;
//	    }
//
//}
