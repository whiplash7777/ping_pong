package exercise.pong.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PongController {

    @PostMapping("/pong")
    public ResponseEntity<String> handlePongRequest(@RequestBody String request) {
        if (request == null || request.trim().isEmpty()) {

            System.out.println("Received Pong request: " + request);
            // return "Pong response";
            return ResponseEntity.badRequest().body("Caller name cannot be empty");
        }
        return ResponseEntity.ok("hello " + request);
    }
}
