package Condition

fun main(){
    println("Enter a year: ")
    var year = readln()!!.toInt()
    if (year%400==0 || year%100!=0 && year%4==0){
        println("$year this year is Leapar")
    }
    else{
        println("$year is not lepyear")
    }
}