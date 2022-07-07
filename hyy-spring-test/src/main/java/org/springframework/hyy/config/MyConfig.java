package org.springframework.hyy.config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * @author: yang.hu
 * @date: 2022/7/7 15:56
 * @version: 1.0.0
 */
@Configuration
@Data
public class MyConfig {
	private String configName = "张三";
}
