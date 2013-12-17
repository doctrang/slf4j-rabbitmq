package net.zharvey.oss.slf4j.rabbitmq.client;

public class RabbitMQConfig {
	private String username;
	
	private String password;
	
	private String virtualHost;
	
	private String hostName;
	
	private String portNumber;
	
	private String exchange;
	
	private String routingKey;

	public RabbitMQConfig(String username, String password, String virtualHost,
			String hostName, String portNumber, String exchange,
			String routingKey) {
		super();
		
		setUsername(username);
		setPassword(password);
		setVirtualHost(virtualHost);
		setHostName(hostName);
		setPortNumber(portNumber);
		setExchange(exchange);
		setRoutingKey(routingKey);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVirtualHost() {
		return virtualHost;
	}

	public void setVirtualHost(String virtualHost) {
		this.virtualHost = virtualHost;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getRoutingKey() {
		return routingKey;
	}

	public void setRoutingKey(String routingKey) {
		this.routingKey = routingKey;
	}
}