package fr.lernejo.prediction;

import java.util.ArrayList;

public record CountryHandler(String country, ArrayList<TemperatureHandler> temperatures) {
}
