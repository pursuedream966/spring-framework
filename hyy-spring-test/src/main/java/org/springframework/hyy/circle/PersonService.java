package org.springframework.hyy.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: yang.hu
 * @date: 2022/7/7 17:57
 * @version: 1.0.0
 */
@Service
public class PersonService {
	@Autowired
	private StudentService studentService;

	public String getById(Integer id){
		return "person";
	}
}
