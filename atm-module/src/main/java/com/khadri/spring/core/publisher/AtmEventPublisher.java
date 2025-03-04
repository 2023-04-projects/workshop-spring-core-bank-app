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

import com.khadri.spring.core.event.HaniAtmEvent;
import com.khadri.spring.core.event.HdfcAtmEvent;
import com.khadri.spring.core.event.SbiAtmEvent;

@Component
public class AtmEventPublisher {
	@Autowired
	ApplicationEventPublisher eventPublisher;

	public void publishEvent(Object source) {

		eventPublisher.publishEvent(new HaniAtmEvent(source, "Hani ATM event Published"));
		eventPublisher.publishEvent(new SbiAtmEvent(source, "Sbi ATM event Published"));
		eventPublisher.publishEvent(new HdfcAtmEvent(source, "Hdfc ATM event Published"));
	}

	public void swipeAtm() {
		System.out.println("ATM Card swipe");
	}

}
