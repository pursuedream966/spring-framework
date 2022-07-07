package org.springframework.hyy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.hyy.config.MyConfig;

public class Main {
	public static void main(String[] args) {
		final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("org.springframework.hyy");
		applicationContext.refresh();

		final MyConfig bean = applicationContext.getBean(MyConfig.class);
		System.out.println(bean.getConfigName());

	}
}