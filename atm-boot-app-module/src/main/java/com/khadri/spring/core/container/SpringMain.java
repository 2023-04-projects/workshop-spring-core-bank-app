package com.khadri.spring.core.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khadri.spring.core.AtmEventPublisher;
import com.khadri.spring.core.config.AppConfig;



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