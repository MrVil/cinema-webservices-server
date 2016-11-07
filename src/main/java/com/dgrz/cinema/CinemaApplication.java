package com.dgrz.cinema;

import com.dgrz.cinema.entities.Actor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
		Actor a = new Actor();
	}
}
