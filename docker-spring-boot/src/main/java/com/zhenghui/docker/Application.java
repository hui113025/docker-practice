package com.zhenghui.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * 主应用入口
 * @author <a href="https://hui113025.github.io/">hui113025.github.io/</a>
 * @date 2017年8月9日
 */
@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World. <br />"
				+ "Welcome to <a href='https://hui113025.github.io/'>hui113025.github.io</a></li>";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
