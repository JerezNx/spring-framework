package xyz.jerez.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liqilin
 * @since 2021/4/24 15:58
 */
@Configuration
public class DemoConfig {

	@Bean
	public User user() {
		return new User();
	}

}
