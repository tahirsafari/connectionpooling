package com.connectionpooling.services;

import java.util.List;

import com.connectionpooling.models.Todo;

public interface ITodoService {

	public void addTodo(Todo todo);
	public List<Todo> getAllTodos();
}
