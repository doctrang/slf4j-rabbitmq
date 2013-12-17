package net.zharvey.oss.slf4j.rabbitmq.loggers;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

public class SLF4JRabbitMQLoggerFactory implements ILoggerFactory {
	@Override
	public Logger getLogger(String loggerClassName) {
		return new SLF4JRabbitMQLogger(loggerClassName);
	}
}