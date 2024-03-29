package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;


@SpringBootApplication
public class SpringBoot04WebRestfulcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot04WebRestfulcrudApplication.class, args);
	}

	//这个地方一下并非实验部分的内容，只是用于测试自定义的视图解析器的自动配置的流程。
	//自己手动添加自定义视图解析器的
	@Bean
	public ViewResolver myViewReolver(){
		return new MyViewResolver();
	}

	public static class MyViewResolver implements ViewResolver{

		@Override
		public View resolveViewName(String viewName, Locale locale) throws Exception {
			return null;
		}
	}
}
