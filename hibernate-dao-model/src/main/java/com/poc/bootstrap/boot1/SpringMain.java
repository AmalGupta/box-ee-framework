/**
 * 
 */
package com.poc.bootstrap.boot1;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poc.services.SampleService;

/**
 * @author amagupta
 *
 */
public class SpringMain {
	
	private static Logger logger = Logger.getLogger(SpringMain.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("**Bootstrapping***");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
		SampleService service = (SampleService)ctx.getBean("sampleService");
		service.service();
	}

}
