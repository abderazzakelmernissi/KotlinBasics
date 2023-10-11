package com.elmernissi.kotlinbasics

fun main() {
    // for on a number range
    for (i in 0..9) {
        println(i)
    }

    // define a list
    val names: Array<String> = arrayOf("Ahmed", "Sara", "Yassine", "Meriem")

    // for loop
    for (name in names) {
        //do something with item
        println(name)
    }

    // with index
    for ((index, name) in names.withIndex()) {
        println("${name} est à l'index ${index}")
    }

    // while
    var age: Int = 0
    while(age < 5) {
        println("Tu as ${age} ans, c'est trop jeune reviens l'année prochaine!")
        // do some code during the year
        age++
    }
    println("OK tu as maintenant ${age} ans, tu peux jouer au basket!")

    // for + continue
    for(name in names) {
        if(name == "Yassine") {
            println("${name} est absent")
            continue
        }
        println("${name} est présent")
    }

    // for + break
    val captainName: String = "Yassine"
    for(name in names) {
        if(name == captainName) {
            println("Nous avons trouvé le capitaine ${name}")
            break
        }
        println("${name} n'est pas capitaine")
    }
}