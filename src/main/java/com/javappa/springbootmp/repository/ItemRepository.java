package com.javappa.springbootmp.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javappa.springbootmp.custom.CustomApplicationReadyEvent;
import com.javappa.springbootmp.custom.CustomBean;

public class ItemRepository implements CustomBean {

	private static final Logger LOG = LoggerFactory.getLogger(ItemRepository.class);

	public void onApplicationEvent(CustomApplicationReadyEvent event) {
		LOG.info("ItemRepository {} is ready", this.getClass().getName());
	}
	
	public String getName() {
		return "REPOSITORY";
	}	
}
