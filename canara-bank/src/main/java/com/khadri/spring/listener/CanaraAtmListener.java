package com.khadri.spring.listener;

import com.khadri.spring.core.event.CanaraAtmEvent;
import com.khadri.spring.core.event.HaniAtmEvent;

public class CanaraAtmListener {
	
	
	public void onApplicationEvent(CanaraAtmEvent event) {
		System.out.println("HANI Bank ATM EVENTS ... !");

	}
}
