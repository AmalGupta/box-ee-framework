/**
 * 
 */
package com.poc.jms.setup;

import javax.jms.Connection;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author amagupta
 *
 */
public class JmsTarget implements Runnable, ExceptionListener {
	
	@Autowired
	protected ActiveMQConnectionFactory mqFactory;
	
	@Value(value = "${activemq.session.default.queue.name}")
	protected String defaultQueue;
	
	protected Connection getNewConnection() throws JMSException{
		return mqFactory.createConnection();
	}
	
	protected Session createDefaultSession(Connection connection) throws JMSException{
		return connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
	}
	
	protected Session createSession(Connection connection, boolean param, int autoAckId) throws JMSException{
		return connection.createSession(param, autoAckId);
	}
	
	@Override
	public void run() {
		
	}

	@Override
	public void onException(JMSException arg0) {
		// TODO Auto-generated method stub
	}

}
