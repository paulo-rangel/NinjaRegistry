package dev.java10x.NinjaRegistry.Missions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MissionController {

    @GetMapping("/")
    String root(){
        return "hello";
    }
}
