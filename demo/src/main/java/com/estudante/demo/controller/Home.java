package com.estudante.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.estudante.demo.model.Numero;

@Controller
public class Home {

    @GetMapping
    public String home(Model model){
        Numero num = new Numero();
        num.setNum1(Math.floor(Math.random()*60));
        num.setNum2(Math.floor(Math.random()*60));
        num.setNum3(Math.floor(Math.random()*60));
        num.setNum4(Math.floor(Math.random()*60));
        num.setNum5(Math.floor(Math.random()*60));
        num.setNum6(Math.floor(Math.random()*60));
        model.addAttribute("num", num);
        return "index.html"; 
    }
    
}
