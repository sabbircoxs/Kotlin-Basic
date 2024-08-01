package Inharit

class Student(name:String, age:Int, gender:String, var studentId:Int): Parson(name, age, gender) {

    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Syudent ID: $studentId")
    }
}