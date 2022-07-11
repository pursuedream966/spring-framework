package org.springframework.hyy.circle;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: yang.hu
 * @date: 2022/7/7 17:55
 * @version: 1.0.0
 */
@Data
@Service
public class StudentService {
	@Autowired
	private PersonService personService;

	public String getById(Integer id){
		final String person = personService.getById(id);
		return "张三" + ":" + person;
	}
}
