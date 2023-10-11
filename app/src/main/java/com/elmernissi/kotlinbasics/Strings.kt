package com.elmernissi.kotlinbasics


fun main() {
    val name = "Ahmed"
    val age = 10
    val height = 1.60F


    println("String template simple : $name a $age ans")

    println("String template complexe : ${name.toUpperCase()} a ${age + 5} ans")

    println("Concaténation classique :\n"
            + "Nom : " + name + "\n"
            + "Age : " + age + "\n")

    println("""Raw string :
Nom : ${name}
Age : ${age}
""")

    println("""Raw string trim :
        |Nom : ${name}
        |Age : ${age}
        """.trimMargin())

    println("""Raw string trim2 :
        >Nom : ${name}
        >Age : ${age}
        >Et encore une nouvelle ligne !
        """.trimMargin(">"))



    //Les conditions
    if (age < 5) {
        println("${name} n'est pas assez vieux pour du basket")
    }

    if (age >= 5 && height >= 1.50f) {
        println("${name} peut jouer au basket")
    } else {
        println("${name} n'a ni l'âge, ni la taille requise pour jouer")
    }

    if (name == "Ahmed") {
        println("${name} est un garçon")
    } else if (name == "Sara") {
        println("${name} est une fille")
    } else {
        println("On ne connait pas le sexe de ${name}")
    }

    val type = if (age < 18) "child" else "adult"
    println("${name} est un ${type}")

    //When


    if (name == "ahmed") {
        println("${name} est un garçon")
    } else if (name == "Sara") {
        println("${name} est une fille")
    } else {
        println("On ne connait pas le genre de ${name}")
    }

    when (name) {
        "Ahmed" -> println("${name} est un garçon")
        "Sara" -> println("${name} est une fille")
        else -> println("On ne connait pas le sexe de ${name}")
    }

    when (age) {
        in 1..5 -> println("${name} est trop jeune")
        in 6..10 -> println("${name} peut jouer au basket")
        !in 1..18 -> println("${name} ne peut pas jouer avec les enfants")
        else -> println("Condition non gérée")
    }

    val canPlayBasketBall = when (age) {
        in 5..10 -> true
        else -> false
    }


    //Nullable et Mutable
    // Decare a mutable / immutable age
    val minimumAge = 5


    // Display a property
    var nameM: String? = "Ahmed"
    println(nameM?.length)

    if (nameM != null) { println(nameM.length) }

    // Decalare a nullable String
    var nullableName: String? = "Ahmed"
    // nullableName = null

    // Check for null in conditions
    if (nullableName != null) {
        // println(nullableName.length)
    }

    // Using the safe call operator "?."
    // nullableName = null
    val nameLength: Int? = nullableName?.length
    println(nameLength)


    // Using the non-null assert operator "!!"
    //nullableName = null
    //val notNullName: String = nullableName!!
    //val nameLengthForced: Int = nullableName!!.length
    //println(name!!.length)
}