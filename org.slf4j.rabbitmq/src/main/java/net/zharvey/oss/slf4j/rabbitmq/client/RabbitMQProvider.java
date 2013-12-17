package net.zharvey.oss.slf4j.rabbitmq.client;


public class RabbitMQProvider {
	private static RabbitMQProvider INSTANCE;
	
	private RabbitMQClient client;
	
	private RabbitMQProvider(final RabbitMQClient client) {
		super();
		
		setClient(client);
	}
	
	public static synchronized RabbitMQProvider getInstance() {
		if(INSTANCE == null) {
			RabbitMQClient client = new RabbitMQClient();
			INSTANCE = new RabbitMQProvider(client);
		}
		
		return INSTANCE;
	}

	public RabbitMQClient getClient() {
		return client;
	}

	public void setClient(RabbitMQClient client) {
		this.client = client;
	}
}