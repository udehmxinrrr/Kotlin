fun main() {

    // THe While Loop
    var num = 20
    while(num <= 25){
        println("Number is $num")
        num++
    }
    println()


    //The For Loop
    for (x in 30 .. 40){
        println("Numeber: $x")
    }
    println()


    for(letter in 'A'..'D'){
        println("My Letter is $letter")
    }
    println()

    //Arrays
    var cars = arrayOf("Volvo","Mercedez", "Bentley", "Rimac")
    for (car in cars){
        println(car)
    }
}