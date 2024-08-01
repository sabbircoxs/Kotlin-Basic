package Loop

fun main(){
    var fact = 1
    var value = 5
    for (i in 1..value){
        fact*=i
    }
    println(fact)
}