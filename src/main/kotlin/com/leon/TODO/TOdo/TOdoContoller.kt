package com.leon.TODO.TOdo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TOdoContoller {
    var Todolist: MutableList<Todo> = mutableListOf()

    @GetMapping("/todos")
    fun getTodo():List<Todo> {
        return Todolist
    }

    @PostMapping("/todos")
    fun addTodos(@RequestBody inputTodo: Todo): Todo {
        Todolist.add(inputTodo)
        return inputTodo
    }
}