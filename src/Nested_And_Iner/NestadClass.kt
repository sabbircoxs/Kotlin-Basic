package Nested_And_Iner

class Outer {
    var name: String = "Shabbir"
    class Nested{
        var outer = Outer()

        fun display(){
            println(outer.name)
        }
    }
}
fun main(){
    var out = Outer()
    var nested = Outer.Nested()
    nested.display()
}