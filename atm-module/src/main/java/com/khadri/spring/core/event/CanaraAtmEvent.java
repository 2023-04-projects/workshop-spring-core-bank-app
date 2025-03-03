package com.khadri.spring.core.event;

import lombok.Getter;

@Getter
public class CanaraAtmEvent {


	public String message;

	public CanaraAtmEvent(Object source, String message) {
		super();
		this.message= message;
	}
}
