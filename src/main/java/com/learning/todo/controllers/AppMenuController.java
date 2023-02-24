package com.learning.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.todo.dao.AppMenuDao;

@Controller
@RequestMapping("/home")
public class AppMenuController{
    private final AppMenuDao appMenuDao;

    public AppMenuController(AppMenuDao appMenuDao) {
        this.appMenuDao = appMenuDao;
    }
    
    @GetMapping("/{role}")
    private String showHomePage(@PathVariable String role,Model model){
        model.addAttribute("menus",this.appMenuDao.getAllMenusByRole(role));
        model.addAttribute("role",role);
        return "home";
    }

}