package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam String name, Model model) {
    Greeting greeting = new Greeting(atomicLong.getAndIncrement(), name);
    model.addAttribute("name", greeting.getContent());
    model.addAttribute("id", greeting.getId());
    return "greeting";
  }
}
