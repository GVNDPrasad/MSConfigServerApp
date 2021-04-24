package com.ms.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsConfigServerApplication {

	private static final Logger log = LoggerFactory.getLogger(MsConfigServerApplication.class);

	public static void main(String[] args) {
		log.info("Satrted MsConfigServerApplication (Config Server Application)");
		SpringApplication.run(MsConfigServerApplication.class, args);
		log.info("Entered MsConfigServerApplication :: main()");
	}

}
