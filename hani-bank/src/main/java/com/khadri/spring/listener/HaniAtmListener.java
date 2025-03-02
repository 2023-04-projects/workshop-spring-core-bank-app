package com.khadri.spring.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.events.HaniAtmEvents;

@Component
public class HaniAtmListener implements ApplicationListener<HaniAtmEvents>{
	
	@Override
	public void onApplicationEvent(HaniAtmEvents event) {
		System.out.println("HANI Bank ATM EVENTS ... !");
		
	}
	
	

}
