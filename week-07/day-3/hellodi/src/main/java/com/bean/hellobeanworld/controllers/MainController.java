package com.bean.hellobeanworld.controllers;

import com.bean.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private UtilityService utilityService;

  @Autowired
  public MainController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String index() {
    return "useful";
  }

  @GetMapping("useful/colored")
  public String colored(Model model) {
    model.addAttribute("randomColor", utilityService.randomColor());
    return "useful";
  }

  @GetMapping("useful/email")
  public String email(Model model, @RequestParam("email") String email) {
    model.addAttribute("email", email);
    model.addAttribute("emailValidation", utilityService.validateEmail(email));
    return "useful";
  }

  @GetMapping("useful/encoder")
  public String encoder(
      Model model, @RequestParam("text") String text, @RequestParam("number") int number) {
    model.addAttribute("encoder", utilityService.caesar(text, number));
    return "useful";
  }

  @GetMapping("useful/decoder")
  public String decoder(
      Model model, @RequestParam("text") String text, @RequestParam("number") int number) {
    model.addAttribute("decoder", utilityService.caesar(text, -number));
    return "useful";
  }
}
