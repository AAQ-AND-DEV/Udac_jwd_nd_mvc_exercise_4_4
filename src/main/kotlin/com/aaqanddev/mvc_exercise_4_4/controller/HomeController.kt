package com.aaqanddev.mvc_exercise_4_4.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

//Spring MVC only looks for @Controller annotations not @Component
@Controller
class HomeController {

    @RequestMapping("/home")
    fun getHomePage(): String{
        return "home"
    }

}