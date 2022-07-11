package org.springframework.hyy.circle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: yang.hu
 * @date: 2022/7/7 17:59
 * @version: 1.0.0
 */
public class CircleMain {
	public static void main(String[] args) {
		final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("org.springframework.hyy.circle");
		applicationContext.refresh();
		final StudentService studentService = applicationContext.getBean(StudentService.class);
		final String student = studentService.getById(1);
		System.out.println(student);
	}
}

