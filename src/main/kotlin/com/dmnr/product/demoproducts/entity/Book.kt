package com.dmnr.product.demoproducts.entity

class Book(
    var title:String,
    var author:String,
    var year:Int
) {
    fun infoBasic(): Pair<String,String> {
        return title to author
    }

    fun infoBasicGeneral(): Triple<String,String,Int> {
        return Triple(title,author,year)
    }

}