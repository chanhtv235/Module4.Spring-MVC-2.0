package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/doi-tien")
    String hello(){
        return "index";
    }
    @GetMapping("/tinh")
    ModelAndView tinhTien(@RequestParam(name = "tiGia") String tiGia, @RequestParam(name = "soTien") String soTien){
        int gia =Integer.parseInt(tiGia);
        int tien =Integer.parseInt(soTien);
        int ketQua =tien*gia;
        ModelAndView modelAndView =new ModelAndView("ketQua");
        modelAndView.addObject("tiGia", gia);
        modelAndView.addObject("tien",tien);
        modelAndView.addObject("ketQua",ketQua);
//        model.addAttribute("tiGia", gia);
//        model.addAttribute("tien",tien);
//        model.addAttribute("ketQua",ketQua);
        return modelAndView;
    }
    @GetMapping("/quay-lai-trang-tinh")
    String quayLai(){
        return "index";
    }

}
