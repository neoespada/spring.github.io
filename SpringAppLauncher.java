package com.ust.app;

import org.springframework.boot.SpringApplication;

import com.ust.controller.MyController;

public class SpringAppLauncher {
	
	public static void main(String[] args) {
		
		SpringApplication.run(MyController.class, args);
		
	}

}
