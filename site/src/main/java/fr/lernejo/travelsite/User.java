package fr.lernejo.travelsite;

public record User(String userEmail, String userName, String userCountry, Weatherexpect weatherExpectation, Integer minimumTemperatureDistance) {
}
