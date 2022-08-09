package com.dmnr.product.demoproducts.entity

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BookTest{

    @Test
    fun testPair() {
        var book = Book("geometria descriptiva","Romero", 2022)
        val testExpected="geometria descriptiva" to "Romero"
        assertEquals( testExpected, book.infoBasic())
    }

    @Test
    fun testTriple() {
        var book = Book("geometria descriptiva","Romero", 2022)
        val testExpected=Triple("geometria descriptiva" ,"Romero", 2022)
        assertEquals( testExpected, book.infoBasicGeneral())
    }
}