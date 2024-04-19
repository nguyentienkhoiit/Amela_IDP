package com.khoinguyen.spring;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Todo {
    int id;
    String name;
    String description;
}
