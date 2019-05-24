package com.bean.hellobeanworld.controllers;

import com.bean.hellobeanworld.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxController {

  private StudentService studentService;

  @Autowired
  public GreenFoxController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/gfa")
  public String mainPage(Model model) {
    model.addAttribute("studentList", studentService.findAll());
    return "gfa";
  }
}
