package org.januson.lexikum.word

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by Januson on 04.12.2016.
 */
@Entity
data class Word(
        var word: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0)