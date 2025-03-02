package com.khadri.spring.core.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.event.SbiAtmEvent;

@Component
public class SbiAtmListener implements ApplicationListener<SbiAtmEvent>{

	@Override
	public void onApplicationEvent(SbiAtmEvent event) {
		System.out.println("sbi atm listener");
	}

}
