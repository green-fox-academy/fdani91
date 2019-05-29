package com.h2.listingtoddosh2;

import com.h2.listingtoddosh2.models.Todo;
import com.h2.listingtoddosh2.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtoddosh2Application implements CommandLineRunner {

  private TodoRepository todoRepository;

  public Listingtoddosh2Application(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(Listingtoddosh2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn ORM"));
    todoRepository.save(new Todo("Do some ASDASD"));
  }
}
