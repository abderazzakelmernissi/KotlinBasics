package com.elmernissi.kotlinbasics

fun main() {
    val age = 5
    val name = "Ahmed"
    val height = 1.60F

    if (age < 5) {
        println("${name} n'est pas assez vieux pour du basket")
    }

    //if Age between 5 and Height 1.5 print can play or ni age ni height
    if (age >= 5 && height >= 1.50f) {
        println("${name} peut jouer au basket")
    } else {
        println("${name} n'a ni l'âge, ni la taille requise pour jouer")
    }

    //if alse if else (garson/fill/ne connait pas le sexe

    if (name == "Ahmed") {
        println("${name} est un garçon")
    } else if (name == "Sara") {
        println("${name} est une fille")
    } else {
        println("On ne connait pas le sexe de ${name}")
    }


    //Affect result to var type in one line and print the line (name & type)
    val type = if (age < 18) "child" else "adult"
    println("${name} est un ${type}")
}