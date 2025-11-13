package de.eldecker.dhbw.spring.windchill;


/**
 * Eigene Exception-Klasse.
 */
@SuppressWarnings("serial")
public class WindChillException extends Exception {

	/**
	 * Konstruktor
	 * 
	 * @param fehlerText Beschreibung des Fehlers
	 */
	public WindChillException( String fehlerText ) {
		
		super( fehlerText );
	}
	
}
