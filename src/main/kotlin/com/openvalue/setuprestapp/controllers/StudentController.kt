package com.openvalue.setuprestapp.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class StudentController {

    @GetMapping(path = ["/"])
    fun home(): ResponseEntity<String> {
        println("Calling home")
        return ResponseEntity.ok("home\n")
    }
}
