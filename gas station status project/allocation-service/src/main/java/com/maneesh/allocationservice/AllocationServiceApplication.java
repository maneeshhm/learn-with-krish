package com.maneesh.allocationservice;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AllocationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllocationServiceApplication.class, args);
	}

//	public CommandLineRunner hello(){
//
//		return args -> {
////			double x = allocationRepository.findById(1).get().getVolume();
////			log.info("Volume is " + String.valueOf(x));
//			log.info("maneesh");
//		};
//	}

}
