package com.simba.bank.controllers;

import com.simba.bank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {



  @GetMapping("/show")
  public String showAccount() {
    return "index";
  }
}
