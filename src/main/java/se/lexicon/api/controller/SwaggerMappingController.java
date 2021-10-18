package se.lexicon.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class SwaggerMappingController {

    @RequestMapping("/")
    public String greeting() {
        return "redirect:/swagger-ui/index.html#/person-controller";
    }
}