package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoItemRepository extends MongoRepository<TodoItem, String> {
    TodoItem findTodoItemsById(String id);
    void deleteTodoItemById(String id);
}
