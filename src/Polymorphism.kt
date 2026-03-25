open class cow { // the keyword "open" makes a class public. classes in Kotlin are private/inaccessible to other classes by default.

    open fun sound(){
        println("Moo! Moo!")
    }
}

open class lion: cow(){
    override fun sound(){
        println("Roar!")
    }
}

fun main(){

    var c = cow()


    var l = lion()
    l.sound()
}