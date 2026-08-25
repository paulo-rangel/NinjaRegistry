package dev.java10x.NinjaRegistry.Ninjas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/welcome")
    public String beWelcome(){
        return "This is my first Spring Application with Java, and I gonna be a great software engineer";
    }

}
