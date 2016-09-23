package eu.h2020.symbiote;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SearchController {

    @RequestMapping("/search")
    public String index() {
        return "Your search results are:";
    }

}