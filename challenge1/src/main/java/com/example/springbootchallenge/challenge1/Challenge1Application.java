package com.example.springbootchallenge.challenge1;

import com.example.springbootchallenge.challenge1.services.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class Challenge1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Challenge1Application.class, args);

		MessageService messageService = context.getBean("messageService",MessageService.class);
		System.out.println(messageService.message());

	}

}
