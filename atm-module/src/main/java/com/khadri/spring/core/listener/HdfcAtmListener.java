package com.khadri.spring.core.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.khadri.spring.core.event.HdfcAtmEvent;

@Component
public class HdfcAtmListener implements ApplicationListener<HdfcAtmEvent> {

	@Override
	public void onApplicationEvent(HdfcAtmEvent event) {
		System.out.println("Hdfc Atm Listener");
	}

}
