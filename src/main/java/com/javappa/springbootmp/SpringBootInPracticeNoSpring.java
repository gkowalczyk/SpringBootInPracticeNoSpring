package com.javappa.springbootmp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javappa.springbootmp.component.ItemComponent;
import com.javappa.springbootmp.controller.ItemController;
import com.javappa.springbootmp.custom.CustomBeanFactory;
import com.javappa.springbootmp.repository.ItemRepository;
import com.javappa.springbootmp.service.ItemService;

public class SpringBootInPracticeNoSpring {

	private static final Logger LOG = LoggerFactory.getLogger(SpringBootInPracticeNoSpring.class);

	public static void main(String[] args) {

		ItemComponent itemComponent = CustomBeanFactory.getBean(ItemComponent.class);
		LOG.info("Application contains: {}", itemComponent.getName());

		ItemController itemController = CustomBeanFactory.getBean(ItemController.class);
		ItemService itemService = CustomBeanFactory.getBean(ItemService.class);
		ItemRepository itemRepository = CustomBeanFactory.getBean(ItemRepository.class);

		LOG.info("Application contains: {}", itemController.getName());
		LOG.info("Application contains: {}", itemService.getName());
		LOG.info("Application contains: {}", itemRepository.getName());
	}
}
