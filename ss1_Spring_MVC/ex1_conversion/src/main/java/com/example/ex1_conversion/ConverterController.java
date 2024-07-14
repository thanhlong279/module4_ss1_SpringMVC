package com.example.ex1_conversion;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping("/convert")
    public String index() {
        return "index";
    }
    @PostMapping("/convert")
    public String convert(@RequestParam("rate") float rate, @RequestParam("usd") float usd, Model model) {
        float vnd = rate * usd;
        model.addAttribute("vnd", vnd);
        model.addAttribute("usd", usd);
        model.addAttribute("rate", rate);
        return "result";
    }
}
