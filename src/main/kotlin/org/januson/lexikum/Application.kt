package org.januson.lexikum

import org.januson.lexikum.word.Word
import org.januson.lexikum.word.WordRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

/**
 * Created by Januson on 04.12.2016.
 */
@SpringBootApplication
open class Application {
    private val log = LoggerFactory.getLogger(Application::class.java)

    @Bean
    open fun init(repository: WordRepository) = CommandLineRunner {
        // save a couple of customers
        repository.save(Word("Jaro"))
        repository.save(Word("Léto"))
        repository.save(Word("Podzim"))
        repository.save(Word("Zima"))
        repository.save(Word("Jeden"))

        // fetch all customers
        log.info("Words found with findAll():")
        log.info("-------------------------------")
        for (word in repository.findAll()) {
            log.info(word.toString())
        }
        log.info("")

        // fetch an individual word by ID
        val word = repository.findOne(1L)
        log.info("Word found with findOne(1L):")
        log.info("--------------------------------")
        log.info(word.toString())
        log.info("")

//        // fetch customers by last name
//        log.info("Customer found with findByLastName('Bauer'):")
//        log.info("--------------------------------------------")
//        for (bauer in repository.findByLastName("Bauer")) {
//            log.info(bauer.toString())
//        }
        log.info("")
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}