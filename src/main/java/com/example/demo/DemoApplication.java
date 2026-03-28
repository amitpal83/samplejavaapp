package com.example.demo;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
	@Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            try {
                String ipAddress = InetAddress.getLocalHost().getHostAddress();
                System.out.println("Server IP Address: " + ipAddress);
            } catch (UnknownHostException e) {
                System.err.println("Could not determine server IP address");
            }
        };
    }
	
}
