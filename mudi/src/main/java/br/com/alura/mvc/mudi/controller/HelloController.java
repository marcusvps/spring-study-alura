package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author marcussantos
 */
@Controller
public class HelloController {

    @GetMapping
    public String hello(Model model){
        model.addAttribute("texto","MUNDO!!");
        return "hello";
    }
}
