package com.connectionmysql.connectionmysql.controllers;

import com.connectionmysql.connectionmysql.models.Todo;
import com.connectionmysql.connectionmysql.repositories.TodoRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;

  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping({"/", "/list"})
  public String list(Model model, @RequestParam(required = false) String isActive) {
    if (isActive != null) {
      if (isActive.equals("true")) {
        model.addAttribute("todos", todoRepository.findAllByDone(false));
      } else {
        model.addAttribute("todos", todoRepository.findAll());
      }
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String showAdd(@ModelAttribute("todo") Todo todo) {
    return "add";
  }

  @PostMapping("/add")
  public String add(@ModelAttribute("todo") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String showEdit(Model model, @PathVariable long id) {
    model.addAttribute("todo", todoRepository.findById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@ModelAttribute("todo") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }
}
