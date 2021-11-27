package my.dash39.metrics_ch1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello my dear world!";
    }
}
