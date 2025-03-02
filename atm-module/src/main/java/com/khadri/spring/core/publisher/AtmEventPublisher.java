package com.khadri.spring.core.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.event.SbiAtmEvent;

@Component
public class AtmEventPublisher implements ApplicationEventPublisher {
	@Autowired
	ApplicationEventPublisher eventPublisher;

	@Override
	public void publishEvent(Object source) {

		// eventPublisher.publishEvent(new HaniAtmEvents(source));
		eventPublisher.publishEvent(new SbiAtmEvent(source, "PublishAtmEvent"));
		// eventPublisher.publishEvent(new HdfcAtmEvent(source, "PublishAtmEvent"));

	}

	public void swipeAtm() {
		System.out.println("ATM Card swipe");
	}
}
