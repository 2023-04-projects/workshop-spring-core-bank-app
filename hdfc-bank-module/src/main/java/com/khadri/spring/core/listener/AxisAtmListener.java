package com.khadri.spring.core.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.atm.events.AxisAtmEvent;

@Component
public class AxisAtmListener implements ApplicationListener<AxisAtmEvent> {

	@Override
	public void onApplicationEvent(AxisAtmEvent event) {
		System.out.println("Handling Axis ATM Event....");

	}

}
