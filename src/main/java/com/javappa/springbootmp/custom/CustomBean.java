package com.javappa.springbootmp.custom;

public interface CustomBean {

	void onApplicationEvent(CustomApplicationReadyEvent event);
	
	public String getName();
}
