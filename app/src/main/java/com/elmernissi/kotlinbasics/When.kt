package com.elmernissi.kotlinbasics

fun main() {

    val age:Number = 12
    val name = "ahmed"



    if (name == "ahmed") {
        println("${name} est un garçon")
    } else if (name == "sara") {
        println("${name} est une fille")
    } else {
        println("On ne connait pas le genre de ${name}")
    }

    //When name equal Ahmed or Sara or else
    when (name){
        "ahmed" -> println("$name est un garcon")
        "sara" -> println("$name est une fille")
        else -> println("On ne connait pas le genre de $name")
    }

    /*when age between 1 et 5 est trop jeune or 6 and 10 (peut jouer au basket) and
     Not in 1..18 (ne peut pas jouer avec les enfants) else ("Condition non gérée")*/
    when (age){
        in 1..5 -> println("$name est trop jeune")
        in 6..10 ->println("$name peut jouer au basket")
        !in 1..18 -> println("$name ne peut pas jouer avec les enfants")
        else -> println("Condition non gérée")
    }

    //affect result of when in 5..10 to a Val CanPlaa boolean
    var canPlayBasket = when(age){
        in 6..10 -> true
        else -> false
    }

    //Test type of var is byte is Int is Float....
    when(age){
        is Int -> println("est un entier")
        is Byte -> println("is Byte")
        is Float -> println("is Float")
    }

}