# Spring Boot: REST-API zur Berechnung von Windchill-Temperatur #

<br>

Dieses Repository enthält eine einfache Spring-Boot-Anwendung, die eine kleine REST-API zur
Berechnung der Windchill-Temperatur (gefühlte Temperatur bei 10° Grad oder weniger) enthält.

<br>

Beispiel-URL bei lokaler Ausführung:
http://localhost:8080/windchill/v1/berechnung?pt=1&wg=25

**Ergebnis:**
```
{
    "tatsaechlicheTemperatur" :  1.0,
    "windgeschwindigkeit"     : 25.0,
    "gefuehlteTemperatur"     : -4.0
}
```
<br>

----

## License ##

<br>

See the [LICENSE file](LICENSE.md) for license rights and limitations (BSD 3-Clause License).

<br>
