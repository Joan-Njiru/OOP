fun main(){
    var joan = Human("Joan",23,55)
    joan.eat(24)
    println(joan.weight)
    joan.speak("I am currently reading The Great Gatsby")
    joan.birthday()
    val Jo = User("Joan","Njiru","joannjiru@gmail.com","0796656168","jojo18")
    println(Jo.lastName)
    println(Jo.phoneNumber)
    }
class Human (var name:String, var age:Int, var weight:Int) {
    fun eat(foodWeight: Int) {
         println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak (speech:String){
        println(speech)
    }
    fun birthday(){
        println(age++)
    }
}
data class User( var firstName:String, var lastName:String, var email:String,var phoneNumber:String,var passWord:String)



