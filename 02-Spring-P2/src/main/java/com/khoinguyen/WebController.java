package com.khoinguyen.spring;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class WebController {
    private List<Todo> todos = new ArrayList<>(Arrays.asList(
            Todo.builder().id(1).name("todo 1").description("description 1").build(),
            Todo.builder().id(2).name("todo 2").description("description 2").build(),
            Todo.builder().id(3).name("todo 3").description("description 3").build()
    ));

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
        todo.setId(todos.get(todos.size() - 1).id + 1);
        todos.add(todo);
        return todo;
    }

    @GetMapping
    @ResponseBody
    public List<Todo> getListTodo() {
        return todos;
    }

    @GetMapping(value = { "/getById", "/getById/{id}" })
    public Todo getById(@PathVariable(required = false) String id) {
        Todo todo = todos.stream().filter(t -> t.getId() == Integer.parseInt(id)).findFirst().orElse(null);
        return id == null ? null : todo;
    }
}

