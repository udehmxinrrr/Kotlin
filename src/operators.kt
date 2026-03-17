
fun main() {
    //Arithmetic Operators
    var x = 56
    var y = 44

    println( x + y)
    println( x - y)
    println( x / y)
    println( x * y)
    println( x % y)
    println()

    //Comparison Operators
    println( x > y)
    println( x < y)
    println( x <= y)
    println( x >= y)
    println( x == y)
    println( x != y) // != means not equal to
    println()

    //Assignment Operators
    var num = 9
    println(num)
    num += 3 // this is the assignment operator for addition
    println(num)
    num -= 3 // this is the assignment operator for subtraction
    println(num)
    println()

    //Logical Operators : &&-AND operator, ||-OR operator, !-NOT operator
        println(100 < 200 && 50 == 25)
        println(100 < 200 || 50 == 25)
        println(!(100 < 200 || 50 == 25))

}