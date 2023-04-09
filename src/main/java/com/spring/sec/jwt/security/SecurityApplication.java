package com.spring.sec.jwt.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {

	public static void getWifiInfoByCmd(String wifi_name) {
		String command = "Netsh wlan show profile name=" + wifi_name + " key=clear";
		System.out.println(command);
	}

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}
