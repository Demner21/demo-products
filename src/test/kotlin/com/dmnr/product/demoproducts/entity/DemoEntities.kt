package com.dmnr.product.demoproducts.entity

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DemoEntities {

    @Test
    fun testClassDemo() {
        val demo = Demo()
        println(String.format("The Length: %s , the width: %s , the height: %s", demo.length, demo.width, demo.height))
        assertEquals(100, demo.length)
    }

    @Test
    fun testSpice() {
        val spice = Spice("curry")
        assertEquals(5, spice.heat)
        assertEquals("curry", spice.name)
    }
    @Test
    fun testSpices(){
        var spices = listOf(
            Spice("curry 2", "mild 2"),
            Spice("curry 3", "mild 3"),
            Spice("curry 4", "mild 2"),
        )
        assertEquals(3, spices.size)
        val filterHeat_five = spices.filter { it.heat < 5 }
        assertEquals(2, filterHeat_five.size)
    }
}