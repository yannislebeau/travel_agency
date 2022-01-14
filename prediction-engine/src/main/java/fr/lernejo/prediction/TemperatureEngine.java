package fr.lernejo.prediction;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@RestController
public class TemperatureEngine {
    @GetMapping("/api/temperature")
    ResponseEntity<CountryHandler> temperatureGetter (@RequestParam String country){
        TemperatureService service = new TemperatureService();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime currentTime = LocalDateTime.now();
        ArrayList<TemperatureHandler> temperatureList = new ArrayList<>();
        for (int x = 0; x <= 1; x++)
            try {
                temperatureList.add(new TemperatureHandler(currentTime.minusDays(x).format(dateFormat), service.getTemperature(country)));
            } catch (UnknownCountryException e) {
                return ResponseEntity.status(417).build();
            }
        CountryHandler countryHandler = new CountryHandler(country, temperatureList);
        return ResponseEntity.ok(countryHandler);
    }
}
