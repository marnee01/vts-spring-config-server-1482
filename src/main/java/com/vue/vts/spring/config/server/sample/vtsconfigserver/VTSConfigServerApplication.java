package com.vue.vts.spring.config.server.sample.vtsconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class VTSConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VTSConfigServerApplication.class, args);
	}

}
