package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import services.DictionaryService;

import java.util.Map;

@org.springframework.stereotype.Controller

@RequestMapping("/dictionary")
public class Controller {
    Map<String, String> dictionary = DictionaryService.getDictionary();

    @RequestMapping("/")
    String formHienThi() {
        return "index";
    }
    @RequestMapping("/search")
    ModelAndView formHienThi(@RequestParam(name = "word") String wordE) {
        String wordVN = dictionary.get(wordE);
        ModelAndView modelAndView = null;
        if (wordVN == null) {
            wordVN = "Not found!";
        }
        modelAndView = new ModelAndView("index", "word", wordVN);
        return modelAndView;
    }
}
