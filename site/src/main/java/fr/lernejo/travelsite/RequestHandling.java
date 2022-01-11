package fr.lernejo.travelsite;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RequestHandling {
    private final UserHandling userhandling;
    @PostMapping("/api/inscription")
    ResponseEntity userCreation (@RequestBody User user){
        userhandling.addUser(user);
        return ResponseEntity.ok().build();
    }
    public RequestHandling(){
        userhandling = new UserHandling();
    }
    @GetMapping("/api/travels")
    ArrayList<CountrySpecs> getSpecs(@RequestParam String userName){
        ArrayList<CountrySpecs> countrySpecsArrayList = new ArrayList<>();
        countrySpecsArrayList.add(new CountrySpecs("moldavie", 20.0));
        countrySpecsArrayList.add(new CountrySpecs("Ouzbékistan", 3.8));
        return countrySpecsArrayList;
    }
}
