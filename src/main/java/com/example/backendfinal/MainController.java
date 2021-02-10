package com.example.backendfinal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String main() {
        return "<a href=\"https://google.com\">Google</a>";
    }

    @PostMapping("/")
    @ResponseBody
    public String mainPost() {
        return "<a href=\"https://google.com\">Google</a>";
    }
}
