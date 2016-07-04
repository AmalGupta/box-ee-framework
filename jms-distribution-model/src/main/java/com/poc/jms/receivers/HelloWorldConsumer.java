/**
 * 
 */
package com.poc.jms.receivers;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;

import com.poc.jms.setup.JmsTarget;
 
/**
 * @author amagupta
 *
 */
public class HelloWorldConsumer extends JmsTarget  {
   
	private Logger logger = Logger.getLogger(HelloWorldConsumer.class);
		
	public void run() {
        try {

            // Create a Connection
            Connection connection = getNewConnection();
            connection.start();

            connection.setExceptionListener(this);
            Session session = createDefaultSession(connection);
            // Create the destination (Topic or Queue)
            Destination destination = session.createQueue(defaultQueue);
           
            // Create a MessageConsumer from the Session to the Topic or Queue
            MessageConsumer consumer = session.createConsumer(destination);

            // Wait for a message
            Message message = consumer.receive(1000);

            if (message instanceof TextMessage) {
                TextMessage textMessage = (TextMessage) message;
                String text = textMessage.getText();
                logger.info("Received: " + text);
            } else {
            	logger.info("Received: " + message);
            }

            consumer.close();
            session.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
    }

    public synchronized void onException(JMSException ex) {
        System.out.println("JMS Exception occured.  Shutting down client.");
    }
}
