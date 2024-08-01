package Inharit

class Teacher(name:String, age:Int, gender:String, var teacherID:Int, var subject:String):Parson(name, age, gender)  {

    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Teachers ID: $teacherID")
        println("Subject: $subject")
    }
}