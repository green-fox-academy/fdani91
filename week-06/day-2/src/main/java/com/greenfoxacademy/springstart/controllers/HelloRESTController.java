package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  private AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping("/greeting")
  public Greeting greet(@RequestParam String name) {
    return new Greeting(atomicLong.getAndIncrement(), "Hello " + name + "!");
  }
}
