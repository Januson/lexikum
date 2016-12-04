package org.januson.lexikum.word

import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by Januson on 04.12.2016.
 */
interface WordRepository : JpaRepository<Word, Long> {

    fun findByWord(word: Word): Iterable<Word>
}