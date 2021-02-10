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
        String html = "<a href=\"https://google.com\">Google</a><br>";
        html += "<a href=\"https://11st.co.kr\">11st.co.kr</a><br>";
        return html;
    }

    @PostMapping("/")
    @ResponseBody
    public String mainPost() {
        return "<a href=\"https://google.com\">Google</a>";
    }
}
