package com.connectionpooling.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectionpooling.models.Todo;
import com.connectionpooling.repositories.TodoRepository;

@Service
public class TodoService implements ITodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public void addTodo(Todo todo) {
		todoRepository.save(todo);
	}

	@Override
	public List<Todo> getAllTodos() {
		return (List<Todo>) todoRepository.findAll();
	}

}
