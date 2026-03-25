open class animal{  // the keyword "open" makes a class public. classes in Kotlin are private/inaccessible to other classes by default.

    var age = 2
    var gender = "Male"
}

class horse:animal(){

    fun movement(){

        println("horse is galloping")
    }
}

class cat{
    fun movement(){

        println("Meow!! Meow!!")
    }
}

fun main() {
    var a = animal()
    var h = horse()
    var c = cat()
}