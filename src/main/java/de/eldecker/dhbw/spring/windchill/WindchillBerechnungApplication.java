package de.eldecker.dhbw.spring.windchill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Einstiegspunkt der Anwendung.
 */
@SpringBootApplication
public class WindchillBerechnungApplication {

	public static void main( String[] args ) {
		
		SpringApplication.run( WindchillBerechnungApplication.class, args );
	}

}
