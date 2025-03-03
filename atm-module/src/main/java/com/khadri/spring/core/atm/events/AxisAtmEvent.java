package com.khadri.spring.core.atm.events;

import org.springframework.context.ApplicationEvent;

public class AxisAtmEvent extends ApplicationEvent {

	private String message;

	public AxisAtmEvent(Object source, String message) {
		super(source);
		this.message = message;

	}

}
