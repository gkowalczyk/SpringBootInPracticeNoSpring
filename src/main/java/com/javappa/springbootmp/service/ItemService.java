package com.javappa.springbootmp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javappa.springbootmp.custom.CustomApplicationReadyEvent;
import com.javappa.springbootmp.custom.CustomBean;

public class ItemService implements CustomBean {

	private static final Logger LOG = LoggerFactory.getLogger(ItemService.class);

	public void onApplicationEvent(CustomApplicationReadyEvent event) {
		LOG.info("ItemService {} is ready", this.getClass().getName());
	}

	public String getName() {
		return "SERVICE";
	}
}
