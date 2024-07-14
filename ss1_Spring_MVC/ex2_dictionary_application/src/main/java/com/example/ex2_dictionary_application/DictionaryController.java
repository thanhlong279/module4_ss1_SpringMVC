package com.example.ex2_dictionary_application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private static final Map<String, String> dictionary = new HashMap<>();
    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("goodbye", "tạm biệt");
        dictionary.put("book", "sách");
        dictionary.put("computer", "máy tính");
    }

    @GetMapping("/translate")
    public String index() {
        return "index";
    }
    @PostMapping("/translate")
    public String translate(@RequestParam("word") String word, Model model) {
        String result = dictionary.get(word.toLowerCase());
        if (result == null) {
            model.addAttribute("word", word);
            model.addAttribute("translation", "ko tim thay");
        }else{
            model.addAttribute("word", word);
            model.addAttribute("translation", result);
        }
        return "result";
    }
}
