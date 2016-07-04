/**
 * 
 */
package com.poc.jms.boot;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poc.jms.producers.HelloWorldProducer;
import com.poc.jms.receivers.HelloWorldConsumer;

/**
 * @author amagupta
 *
 */
public class ActiveMQHelloWorld {

	private static Logger logger = Logger.getLogger(ActiveMQHelloWorld.class);
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
			
			ApplicationContext ctx = new ClassPathXmlApplicationContext("jms-context.xml");
			
			logger.info("*** Bootstrapping jms-model ***");
			
			String prodBeanName="producer";
			String consumerBeanName="consumer";
			
			/** Code to invoke targets **/
			/** The appropriate way to invoke will be to call the targets which are instances of JmsTarget to be executed in a separate 
			 * thread with the message pay load. 
			 * 
			 */
		    thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	        thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        Thread.sleep(1000);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	        Thread.sleep(1000);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	        thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	        Thread.sleep(1000);
	        thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        thread((HelloWorldConsumer)ctx.getBean(consumerBeanName), false);
	        thread((HelloWorldProducer)ctx.getBean(prodBeanName), false);
	}

	 public static void thread(Runnable runnable, boolean daemon) {
	        Thread brokerThread = new Thread(runnable);
	        brokerThread.setDaemon(daemon);
	        brokerThread.start();
	    }
}
