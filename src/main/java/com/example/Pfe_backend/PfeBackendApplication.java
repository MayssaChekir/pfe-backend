package com.example.Pfe_backend;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PfeBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(PfeBackendApplication.class, args);
		MethodDelegationBinder.BindingResolver.StreamWriting.toSystemOut();
	}

}










