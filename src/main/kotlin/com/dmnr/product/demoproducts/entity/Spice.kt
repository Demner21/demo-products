package com.dmnr.product.demoproducts.entity

class Spice(
    var name: String,
    var spiciness: String = "mild"
) {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "mild 2" -> 2
                "mild 3" -> 6
                else -> 0
            }
        }

    init {
        println(String.format("name: %s and spiciness: %s", this.name, this.spiciness))
    }

}