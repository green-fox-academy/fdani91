package com.connectionmysql.connectionmysql;

import com.connectionmysql.connectionmysql.models.Todo;
import com.connectionmysql.connectionmysql.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionmysqlApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  public ConnectionmysqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    //    todoRepository.save(new Todo("I have to learn ORM", true, false));
    //    todoRepository.save(new Todo("I have to ASDASD", false, false));
    //    todoRepository.save(new Todo("I have to play LoL", true, true));
    //    todoRepository.save(new Todo("Drink beer"));
  }

  public TodoRepository getTodoRepository() {
    return todoRepository;
  }

  public void setTodoRepository(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
}
