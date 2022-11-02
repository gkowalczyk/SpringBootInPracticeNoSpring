package com.javappa.springbootmp.custom;

import java.util.LinkedHashMap;
import java.util.Map;

import com.javappa.springbootmp.component.ItemComponent;
import com.javappa.springbootmp.controller.ItemController;
import com.javappa.springbootmp.repository.ItemRepository;
import com.javappa.springbootmp.service.ItemService;

public class CustomBeanFactory {

	public static Map<Class<?>, CustomBean> customBeans = new LinkedHashMap<>();

	static {
		customBeans.put(ItemController.class, CustomBeanFactory.createBean(ItemController.class));
		customBeans.put(ItemService.class, CustomBeanFactory.createBean(ItemService.class));
		customBeans.put(ItemRepository.class, CustomBeanFactory.createBean(ItemRepository.class));
		customBeans.put(ItemComponent.class, CustomBeanFactory.createBean(ItemComponent.class));

		customBeans.values().stream()
				.forEach(customBean -> customBean.onApplicationEvent(new CustomApplicationReadyEvent()));
	}

	static CustomBean createBean(Class<?> requiredType) {

		if (requiredType.equals(ItemComponent.class)) {
			return new ItemComponent();
		} else if (requiredType.equals(ItemController.class)) {
			return new ItemController();
		} else if (requiredType.equals(ItemService.class)) {
			return new ItemService();
		} else if (requiredType.equals(ItemRepository.class)) {
			return new ItemRepository();
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<?> requiredType) {
		return (T) customBeans.get(requiredType);
	}
}
