package com.aaqanddev.mvc_exercise_4_4.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import java.time.Instant

//Spring MVC only looks for @Controller annotations not @Component
@Controller
class HomeController {

    @RequestMapping("/home")
    fun getHomePage(model: Model): String{
        model.addAttribute("welcomeMessage", Instant.now().toString())
        return "home"
    }

}