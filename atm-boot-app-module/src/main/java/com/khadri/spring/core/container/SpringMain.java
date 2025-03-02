package com.khadri.spring.core.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khadri.spring.core.config.AppConfig;
import com.khadri.spring.core.publisher.AtmEventPublisher;



public class SpringMain {

	public static void main(String[] args) {
		SpringMain main = new SpringMain();
		main.invoke();

	}

	private void invoke() {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AtmEventPublisher atmEventPublisher = context.getBean(AtmEventPublisher.class);

		atmEventPublisher.publishEvent(this);

	}
}