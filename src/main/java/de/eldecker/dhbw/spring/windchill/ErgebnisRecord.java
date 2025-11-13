package de.eldecker.dhbw.spring.windchill;


/**
 * Eine Instanz der folgenden Record-Klasse enthält die Rückgabe-Werte für
 * den Aufruf des REST-Endpunkts zur Berechnung der gefühlten Temperatur.
 * 
 * @param tatsaechlicheTemperatur Tatsächliche (physische) Temperatur in Grad Celsius
 * 
 * @param windgeschwindigkeit Windgeschwindigkeit in km/h
 * 
 * @param gefuehlteTemperatur Berechnungsergebnis: Gefühlte Temperatur in Grad Celsius
 */
public record ErgebnisRecord( double tatsaechlicheTemperatur, 
		                      double windgeschwindigkeit, 
		                      double gefuehlteTemperatur 
		                    ) {
}
