package com.khadri.spring.core.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.khadri.spring.core.event.HdfcAtmEvent;

@Component
public class HdfcAtmListener {
	@EventListener
	public void hdfcEvent(HdfcAtmEvent event) {
		System.out.println("hdfc atm listener");
	}

}
