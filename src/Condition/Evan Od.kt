package Condition

fun main(){
    print("Enter a Number: ")
    var a = readln()!!.toInt()
    if (a%2==0){
        println("$a is Evan")
    }
    else{
        println("$a is Odd")
    }
}