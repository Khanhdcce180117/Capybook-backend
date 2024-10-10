package fa24.swp391.se1802.group3.capybook.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/book")
public class BookController {
    @GetMapping("hello")
    public String helloWorld() {
        return "Hello World";
    }
}