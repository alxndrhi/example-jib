package dev.hinrichs.jibwebdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JibController {
    @GetMapping("/")
    public String get() {
        return "Hello World";
    }
}
