//package com.sptries.tododo;
//
//import java.util.List;
//
//
//public class TodoService {
//    private TodoRepository rep = new TodoRepository();
//
//    public TodoDTO addTodo(TodoDTO todo) {
//        return rep.saveTodo(todo);
//    }
//
//    public TodoDTO findTodoById(int id) {
//        return rep.findTodoById(id);
//    }
//
//    public List<TodoDTO> getAllTodos() {
//        return rep.getAllList();
//    }
//
//    public boolean deleteTodoById(int id) {
//        return rep.deleteTodoById(id)!=null;
//    }
//}

package com.sptries.tododo;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository rep;

    // Constructor injection
    public TodoService(TodoRepository rep) {
        this.rep = rep;
    }

    // Add or update a todo
    public TodoDTO addTodo(TodoDTO todo) {
        return rep.save(todo);
    }

    // Get a todo by ID
    public TodoDTO findTodoById(int id) {
        Optional<TodoDTO> todo = rep.findById(id);
        return todo.orElse(null);
    }

    // Get all todos
    public List<TodoDTO> getAllTodos() {
        return rep.findAll();
    }

    // Delete a todo by ID
    public boolean deleteTodoById(int id) {
        if (rep.existsById(id)) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
