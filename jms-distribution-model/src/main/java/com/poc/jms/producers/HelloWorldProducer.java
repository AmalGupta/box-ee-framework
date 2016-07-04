/**
 * 
 */
package com.poc.jms.producers;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

import com.poc.jms.setup.JmsTarget;

/**
 * @author amagupta
 *
 */
public class HelloWorldProducer extends JmsTarget {

	private Logger logger = Logger.getLogger(HelloWorldProducer.class);
	
	@Value(value = "${activemq.session.default.queue.name}")
	private String defaultQueue;
	
	public void run() {
        try {

        	// Create a Connection
            Connection connection = getNewConnection();
            connection.start();

            Session session = createDefaultSession(connection);
            // Create the dest	ination (Topic or Queue)
            Destination destination = session.createQueue(defaultQueue);
            
            MessageProducer producer = session.createProducer(destination);

            // Create a messages
            String text = "Hello world! From: " + Thread.currentThread().getName() + " : " + this.hashCode();
            TextMessage message = session.createTextMessage(text);

            // Tell the producer to send the message
            logger.info("Sent message: "+ message.hashCode() + " : " + Thread.currentThread().getName() +" from : "+this.hashCode());
            producer.send(message);

            // Clean up
            session.close();
            connection.close();
        }
        catch (Exception e) {
        	logger.error("Caught: " + e);
            e.printStackTrace();
        }
    }
}
