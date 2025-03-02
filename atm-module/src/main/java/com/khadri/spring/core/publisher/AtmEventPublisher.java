 package com.khadri.spring.core.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.events.HaniAtmEvents;

@Component
public  class AtmEventPublisher implements ApplicationEventPublisher {
	
	private ApplicationEventPublisher eventPublisher;
	
	@Override
	public void publishEvent(Object event) {

		eventPublisher.publishEvent(new HaniAtmEvents(event));
	}

	public void swipeAtm() {
		System.out.println("ATM Card swipe");
	}
}
