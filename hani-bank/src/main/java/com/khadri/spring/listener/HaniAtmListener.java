package com.khadri.spring.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.event.HaniAtmEvent; 

@Component
public class HaniAtmListener implements ApplicationListener<HaniAtmEvent> {

	@Override
	public void onApplicationEvent(HaniAtmEvent event) {
		System.out.println("HANI Bank ATM EVENTS ... !");

	}

}
