class dog( var breed: String, var age: Int, var gender: String){

   fun bark(){
       println("Woof!! Woof!!")
   }
}

fun main(){

    var dog1 = dog("German Shepherd",12,"Male")
    println(dog1.breed)
    dog1.bark()

    var dog2 = dog("Siberian Husky",4, "Female")
}