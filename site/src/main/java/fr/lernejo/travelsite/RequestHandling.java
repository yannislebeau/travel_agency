package fr.lernejo.travelsite;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
