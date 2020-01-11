package com.altenTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class AltenTestApplication implements CommandLineRunner {
	
	@Value("${entorno}")
	private String entorno;

	public static void main(String[] args) {
		SpringApplication.run(AltenTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("///////////////////////////////////////////");
		log.info("//		APLICACION ARRANCADA          //");
		log.info("//		Entorno: " + entorno + "	              //");
		log.info("///////////////////////////////////////////");
		
	}

}
