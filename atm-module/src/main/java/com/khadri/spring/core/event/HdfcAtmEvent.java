package com.khadri.spring.core.event;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;

@Getter
public class HdfcAtmEvent extends ApplicationEvent {

	public String message;

	public HdfcAtmEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

}
