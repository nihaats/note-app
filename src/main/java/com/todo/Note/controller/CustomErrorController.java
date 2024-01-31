package com.todo.Note.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Hata sayfanızın adını döndürün (örneğin, "errorPage" gibi)
        return "error";
    }

//    @Override
//    public String getErrorPath() {
//        return "/error";
//    }
}
