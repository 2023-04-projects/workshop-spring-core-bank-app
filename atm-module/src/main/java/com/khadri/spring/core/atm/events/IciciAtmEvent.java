package com.khadri.spring.core.atm.events;

import org.springframework.context.ApplicationEvent;

public class IciciAtmEvent extends ApplicationEvent {

	private String message;

	public IciciAtmEvent(Object source,String message ) {
		super(source);
		this.message = message;
	}

}
