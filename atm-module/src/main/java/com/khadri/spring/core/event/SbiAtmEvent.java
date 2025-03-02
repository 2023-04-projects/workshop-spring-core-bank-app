package com.khadri.spring.core.event;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;

@Getter
public class SbiAtmEvent extends ApplicationEvent {

	public String message;

	public SbiAtmEvent(Object source, String message) {
		super(source);
		this.message= message;
	}
	

}
