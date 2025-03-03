package com.khadri.spring.core.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.event.HaniAtmEvent;

@Component
public class HaniAtmListener {
	@EventListener
	public void haniEvent(HaniAtmEvent event) {
		System.out.println("HANI Bank ATM EVENTS ... !");

	}

}
