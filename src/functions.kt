fun main() {

    //Standard Library Functions
    var number = Math.sqrt(169.0)
    println(number)

    var num = Math.max(23,56)
    println(num)

    day()
    student("John", 7)
    student("Mark", 19)
    student("Max", 16)
}

//User-defined Functions
fun day(){
    println("Today is Wednesday")

}

fun student(name:String, age:Int){
    println("$name is $age yrs old")
}