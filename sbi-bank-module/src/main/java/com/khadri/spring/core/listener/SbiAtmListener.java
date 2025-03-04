package com.khadri.spring.core.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.event.SbiAtmEvent;

@Component
public class SbiAtmListener {
	@EventListener
	public void sbiEvent(SbiAtmEvent event) {
		System.out.println("sbi atm listener");
	}
}
