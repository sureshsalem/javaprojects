package net.talaatharb.jms.tibco.config;


import jakarta.jms.ConnectionFactory;
import jakarta.jms.Destination;
import jakarta.jms.DeliveryMode;
import jakarta.jms.JMSException;
import jakarta.jms.Session;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.connection.*;

import com.tibco.tibjms.TibjmsConnectionFactory;

@Configuration
@EnableJms
public class TibcoBusConfiguration {
	@Value("${ems.password}")
	private String password;

	@Value("${ems.port}")
	private String port;

	@Value("${ems.queue}")
	private String queue;

	@Value("${ems.server}")
	private String server;

	@Value("${ems.user}")
	private String user;

	@Bean(name = "jmsConnectionFactory")
	public ConnectionFactory jmsConnectionFactory() throws JMSException {
		final TibjmsConnectionFactory factory = new TibjmsConnectionFactory();

		factory.setServerUrl(serverURL());
		factory.setUserName(user);
		factory.setUserPassword(password);

		return (ConnectionFactory) factory;
		
	}

	@Bean
	public JmsTemplate jmsTemplate(
			@Autowired ConnectionFactory jmsConnectionFactory) {
		final JmsTemplate jmsTemplate = new JmsTemplate();
		
		//jmsTemplate.setConnectionFactory(null);

		jmsTemplate.setConnectionFactory(jmsConnectionFactory);
		
		//jmsTemplate.setConnectionFactory(TibjmsConnectionFactory);
		jmsTemplate.setDefaultDestinationName(queue);
		jmsTemplate.setExplicitQosEnabled(true);
		jmsTemplate.setDeliveryMode(DeliveryMode.PERSISTENT);
		jmsTemplate.setSessionAcknowledgeMode(Session.CLIENT_ACKNOWLEDGE);
		jmsTemplate.setSessionTransacted(false);

		return jmsTemplate;
	}

	private String serverURL() {
		return "tcp://" + server + ":" + port;
	}
}