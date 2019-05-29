package com.connectionmysql.connectionmysql.repositories;

import com.connectionmysql.connectionmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  Iterable<Todo> findAllByDone(boolean done);
}
