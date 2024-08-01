package OOP_Kotlin

import java.awt.Color

class Fruit {
    var name: String = ""
    var color: String = ""
    var size: String = ""
    constructor(name: String)
    constructor(name: String, color: String) {
        this.name = name
        this.color = color
    }
    constructor(name: String, color: String, size:Int){
        println("Name: $name, Color: $color, Size: $size")
    }
//class Fruit(var name: String, var color: String, var size: Int) {
//    var name: String = ""
//    var color: String = ""
//    var size: String = ""

//    fun display(){
//        println("Name:$name")
//        println("Color:$color")
//        println("Size:$size")
//    }

//    init {
//        println("Name:$name")
//        println("Color:$color")
//        println("Size:$size")
//    }

}