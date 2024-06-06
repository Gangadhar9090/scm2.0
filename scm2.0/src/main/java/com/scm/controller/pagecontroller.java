package com.scm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class pagecontroller {
   
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("home page handler");
        //sending data to view
        model.addAttribute("name","sunbelt technologies");
        model.addAttribute("youtube", "alenwalker");
        model.addAttribute("instagram", "https://www.instagram.com");
        return "home";        
    }

    //about route
   
  
   @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin", true);
        System.out.println("about page loading");
        return "about";

    }

    // services
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("services page loading");
        return "services";

    }

}
