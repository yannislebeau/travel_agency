package fr.lernejo.travelsite;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHandling {
    @PostMapping("/api/inscription")
    ResponseEntity userCreation (@RequestBody User user){
        System.out.println("ca marche");
        return ResponseEntity.ok().build();
    }
}
