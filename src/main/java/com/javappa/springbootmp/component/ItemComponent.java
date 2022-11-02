package com.javappa.springbootmp.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javappa.springbootmp.custom.CustomApplicationReadyEvent;
import com.javappa.springbootmp.custom.CustomBean;

public class ItemComponent implements CustomBean {

	private static final Logger LOG = LoggerFactory.getLogger(ItemComponent.class);

	public void onApplicationEvent(CustomApplicationReadyEvent event) {
		LOG.info("ItemComponent {} is ready", this.getClass().getName());
	}

	public String getName() {
		return "COMPONENT";
	}
}
