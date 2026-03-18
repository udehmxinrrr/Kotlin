fun main() {

    var day = 7
    var result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"

    else -> "Invalid Day of the Week"
    }

    println("Today is $result")
}