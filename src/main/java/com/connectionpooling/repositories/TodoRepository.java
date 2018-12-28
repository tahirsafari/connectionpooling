package com.connectionpooling.repositories;

import org.springframework.data.repository.CrudRepository;

import com.connectionpooling.models.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
