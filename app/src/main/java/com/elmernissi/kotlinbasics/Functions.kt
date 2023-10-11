package com.elmernissi.kotlinbasics


//isOldEnough
fun isOldEnought(age:Int):Boolean{
    return age>=5
}

//describePeople
fun describePeople(name:String, age:Int, height:Float){
    var canPlayBasketball = when(isOldEnought(age)){
        true -> "peut jouer le basketball"
        false -> "ne peut pas jouer le basketball"
    }
    println("$name a $age ans, de $height m et $canPlayBasketball")
}
fun describePeople(name:String, age:Int, height: Float,details:String ="Pas de detail"){
    var canPlayBasketball = when(isOldEnought(age)){
        true -> "peut jouer le basketball"
        false -> "ne peut pas jouer le basketball"
    }
    println("$name a $age ans, de $height m et $canPlayBasketball , ($details)" )
}


fun main() {
    var name:String ="Ahmed"
    var age:Int = 17
    var height:Float = 1.6f

    isOldEnought(age)

    describePeople(name,age,height)
    name = "Sara"
    age = 18
    height = 1.9f
    describePeople(name,age,height, details = "Champion")

}