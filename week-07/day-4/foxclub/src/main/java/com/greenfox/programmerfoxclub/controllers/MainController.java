package com.greenfox.programmerfoxclub.controllers;

import com.greenfox.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String showIndex(
      Model model, @RequestParam(value = "name", required = false) String name) {
    if (name == null) {
      return "redirect:/login";
    }
    model.addAttribute("fox", foxService.getCurrentFox(name));
    return "index";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String postLogin(@RequestParam("name") String name) {
    try {
      foxService.addIfValid(name);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return "redirect:/?name=" + name;
  }
}
