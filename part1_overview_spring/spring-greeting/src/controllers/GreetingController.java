package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
//    public ModelAndView greeting(){
//        ModelAndView modelAndView=new ModelAndView("index","name","ChanhTV");
//        return modelAndView;
//    }
//    public String greeting(){
//        return "index";
//    }
    public String greeting(@RequestParam String name, Model modle){
        modle.addAttribute("name", name);
        return "index";
    }
}
