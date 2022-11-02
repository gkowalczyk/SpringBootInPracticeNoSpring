package com.javappa.springbootmp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javappa.springbootmp.custom.CustomApplicationReadyEvent;
import com.javappa.springbootmp.custom.CustomBean;

public class ItemController implements CustomBean {

	private static final Logger LOG = LoggerFactory.getLogger(ItemController.class);
	
	public void onApplicationEvent(CustomApplicationReadyEvent event) {
		LOG.info("ItemController {} is ready", this.getClass().getName());
	}	
	
	public String getName() {
		return "CONTROLLER";
	}	
}
