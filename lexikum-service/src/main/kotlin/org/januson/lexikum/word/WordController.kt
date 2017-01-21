package org.januson.lexikum.word

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Januson on 04.12.2016.
 */
@RestController
class WordController(val repository: WordRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()
}