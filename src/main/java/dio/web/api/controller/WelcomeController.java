package dio.web.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Meu amor Eduarda" +
                 " Te amo";
    }
}
