package xyz.jerez.spring.demo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author liqilin
 * @since 2021/4/24 15:54
 */
public class User {

	@Value("${user.name:liqilin}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
