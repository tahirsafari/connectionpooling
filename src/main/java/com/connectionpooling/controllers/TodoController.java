package com.connectionpooling.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.connectionpooling.services.ITodoService;
import com.connectionpooling.models.Todo;

@RestController
@RequestMapping("/todo")
public class TodoController {
	private static final Logger LOG = LoggerFactory.getLogger(TodoController.class);
	@Autowired
	private ITodoService todoService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Todo> getAllTodos(){
		LOG.info("Request processed");
		return todoService.getAllTodos();
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Map<String, String> addTodo(@Valid @RequestBody Todo todo) {
		todoService.addTodo(todo);
		Map<String, String> map = new HashMap<>();
		map.put("message", "Todo added successfully.");
		//Todo todo = new Todo(3,"test", "test")
		return map;
	}
	

}
