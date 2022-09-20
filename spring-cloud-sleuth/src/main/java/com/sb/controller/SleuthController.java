package com.sb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleuthController {

	public static Logger logger = LoggerFactory.getLogger(SleuthController.class);
	@GetMapping(value="/healthcheck")
	public String getHealthcheck() {
		logger.info("Entering Healthcheck!");
		String message = "Hello Sleuth!";
		logger.info("Leaving Healthcheck!");
		return message;
	}
}
