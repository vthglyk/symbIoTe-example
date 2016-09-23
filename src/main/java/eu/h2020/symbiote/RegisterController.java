package eu.h2020.symbiote;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RegisterController {

    @RequestMapping("/register")
    public String index() {
        return "You registered a sensor";
    }

}