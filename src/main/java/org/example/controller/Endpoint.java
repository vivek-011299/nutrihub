package org.example.controller;

import org.apache.coyote.Response;
import org.example.model.UserInput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {
    @RequestMapping("/")
    public ResponseEntity<String> index(@RequestBody UserInput userInput)
    {
        System.out.println(userInput.getInput());
        return ResponseEntity.ok("Data fetched from the user");
    }
}
