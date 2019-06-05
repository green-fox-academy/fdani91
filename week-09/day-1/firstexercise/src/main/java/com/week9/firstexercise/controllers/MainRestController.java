package com.week9.firstexercise.controllers;

import com.week9.firstexercise.models.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @GetMapping("doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return new Doubled(input);
    } else return new ErrorMessage("Please provide an input");
  }

  @GetMapping("greeter")
  public Object greeter(
      @RequestParam(value = "name", required = false) String name,
      @RequestParam(value = "title", required = false) String title) {
    if (name == null && title == null) {
      return new ErrorMessage("Please provide a name and a title!");
    } else if (title == null) {
      return new ErrorMessage("Please provide a title!");
    } else if (name == null) {
      return new ErrorMessage("Please provide a name!");
    }
    return new Greeting(name, title);
  }

  @GetMapping("appenda/{appendable}")
  public Object appendA(@PathVariable("appendable") String appendable) {
    return new AppendA(appendable + "a");
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(
      @PathVariable("action") String action, @RequestBody(required = false) Until until) {
    if (until == null) {
      return new ErrorMessage("Please provide a number");
    } else {
      return new DoUntil(until, action);
    }
  }
}
