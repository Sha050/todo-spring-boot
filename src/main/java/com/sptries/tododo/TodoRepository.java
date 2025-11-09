//package com.sptries.tododo;
//
//import java.util.*;
//
//public class TodoRepository {
//
//    private List<TodoDTO> todoList = new ArrayList<>();
//    private int nextId = 1;
//
//    public TodoDTO saveTodo(TodoDTO todo) {
//        todo.setId(nextId);
//        todoList.add(todo);
//        nextId++;
//        return todo;
//    }
//
//    public List<TodoDTO> getAllList() {
//        return todoList;
//    }
//
//    public TodoDTO findTodoById(int id) {
//        for(TodoDTO td : todoList) {
//            if(td.getId() == id) {
//                return td;
//            }
//        }
//        return null;
//    }
//
//    public TodoDTO deleteTodoById(int id) {
//        Iterator<TodoDTO> iterator = todoList.iterator();
//        while(iterator.hasNext()) {
//            TodoDTO td = iterator.next();
//            if(td.getId() == id) {
//                iterator.remove();
//                return td;
//            }
//        }
//        return null;
//    }
//}

package com.sptries.tododo;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface TodoRepository extends JpaRepository<TodoDTO, Integer> {
//}

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoDTO,Integer> {
}
