package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping("")
    public String formCalculator(){
        System.out.println("hello");
        return "home";
    }
    @PostMapping("")
    public String calculator(@RequestParam("number1") double number1, @RequestParam("number2") double number2,
                            @RequestParam("cal") String cal, Model model){
        String message="";
        double result = 0;
        switch (cal) {
            case "Add":
                result = number1 + number2;
                break;
            case "Sub":
                result = number1 - number2;
                break;
            case "Mul":
                result = number1 * number2;
                break;
            default:
                if (number2!=0){
                    result = number1/number2;
                }else {
                    message="Number2 is not Zero!!!";
                }
                break;
        }
        System.out.println("kết quả : "+result);
        model.addAttribute("result",result);
        model.addAttribute("message",message);
        return "home";
    }
}
