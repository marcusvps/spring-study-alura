package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author marcussantos
 */
@Controller
public class HelloController {

    @GetMapping
    public ModelAndView hello(Model model){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        model.addAttribute("texto","MUNDO!!");
        return mv;
    }
}
