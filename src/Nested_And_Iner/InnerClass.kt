package Nested_And_Iner

class Outer1 {
    var name: String = "Shabbir"
    class Nested{
        var outer1 = Outer1()

        fun display(){
            println(outer1.name)
        }
    }
}
fun main(){
    var out = Outer1()
    var nested = Outer1.Nested()
    nested.display()
}
