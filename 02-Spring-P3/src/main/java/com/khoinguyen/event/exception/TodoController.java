package com.khoinguyen.event.exception;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api/v1")
public class TodoController {
    private List<Todo> todos;

    @PostConstruct
    public void init() {
        todos = IntStream.range(1, 10)
                .mapToObj(i -> new Todo("title = "+i, "detail = "+i))
                .toList();
    }

    @GetMapping("/todo/{todoId}")
    public Todo getTodo(@PathVariable int todoId) {
        return todos.get(todoId);
    }
}
