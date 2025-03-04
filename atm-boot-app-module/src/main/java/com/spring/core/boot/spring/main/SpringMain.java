package com.spring.core.boot.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khadri.spring.core.config.AppConfig;
import com.khadri.spring.core.publisher.AtmEventPublisher;

public class SpringMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AtmEventPublisher atmEvent = context.getBean(AtmEventPublisher.class);
		atmEvent.swipeAtm();
	}
}
