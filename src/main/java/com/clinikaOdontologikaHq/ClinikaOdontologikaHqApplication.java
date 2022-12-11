package com.clinikaOdontologikaHq;
import org.apache.log4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ClinikaOdontologikaHqApplication {




	public static void main(String[] args) {


		PropertyConfigurator.configure("C:/resol/Proyecto/clinikaOdontologikaHq/src/main/resources/log4j.properties");

		SpringApplication.run(ClinikaOdontologikaHqApplication.class, args);

	}




}
