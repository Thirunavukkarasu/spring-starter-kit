package com.sb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleuthController {

	public static Logger logger = LoggerFactory.getLogger(SleuthController.class);

	@GetMapping(value = "/healthcheck")
	public String getHealthcheck() {
		logger.info("Entering Healthcheck!");
		String responseContent = "<html>\n" + "<header><title>Welcome</title></header>\n" +
				"<body><h1>\n" + "Hello Sleuth!\n"
				+ "</h1><p>Spring Cloud Sleuth allows you to aggregate and track log entries as requests move through a distributed software system. In a monolithic system, it’s relatively easy to track requests as they move through the codebase because all requests can easily be logged to the same log file. You can generally just filter the log by the thread ID. But in a distributed system, a single client request may sprawl across any number of discrete cloud services. Any given service may have multiple instances handling different parts of the request. There is no single log file, with a request spread across multiple server instances. How do you use logs in this situation? How do you trace a request flow across a service mesh?</p></body>\n"
				+ "</html>";
		logger.info("Leaving Healthcheck!");
		return responseContent;
	}
}
