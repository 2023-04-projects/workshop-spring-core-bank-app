package com.khadri.spring.core.event;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;

@Getter
public class HaniAtmEvent extends ApplicationEvent {

	public String message;

	public HaniAtmEvent(Object source, String message) {
		super(source);
		this.message = message;

	}
}
