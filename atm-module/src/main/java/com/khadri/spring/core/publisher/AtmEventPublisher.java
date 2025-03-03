package com.khadri.spring.core.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.atm.events.AxisAtmEvent;

@Component
public class AtmEventPublisher implements ApplicationEventPublisher {

	@Autowired
	private AtmEventPublisher atmEventPublisher;

	public void publishEvent(Object event) {
		atmEventPublisher.publishEvent (new AxisAtmEvent(event,"publishEvent"));
	}

	public void swipeAtm() {
		System.out.println("ATM Card Swiped...");

	}

}
