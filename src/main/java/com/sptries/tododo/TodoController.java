package com.sptries.tododo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/todo")
public class TodoController {

    //new

    private final TodoService service;

    // Constructor injection (Spring automatically provides TodoService)
    public TodoController(TodoService service) {
        this.service = service;
    }

    //new

    @GetMapping("/home")
    public String homePage() {
        return "Home page";
    }

    @PostMapping("/add")
    public TodoDTO addTodo(@RequestBody TodoDTO todo) {
        return service.addTodo(todo);
    }

    @GetMapping("/showAll")
    public List<TodoDTO> showAllTodo() {
        return service.getAllTodos();
    }

    @GetMapping("/{id}")
    public TodoDTO findById(@PathVariable int id) {
        return service.findTodoById(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable int id) {
        return service.deleteTodoById(id);
    }
}
