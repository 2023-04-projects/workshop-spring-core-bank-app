package com.khadri.spring.core;

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

		eventPublisher.publishEvent(new SbiAtmEvent(source, "PublishAtmEvent"));
		// eventPublisher.publishEvent(new HdfcAtmEvent(source, "PublishAtmEvent"));

	}

}
