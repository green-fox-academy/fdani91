package com.h2.listingtoddosh2.repositories;

import com.h2.listingtoddosh2.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {}
