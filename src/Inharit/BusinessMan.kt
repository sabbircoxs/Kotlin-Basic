package Inharit

class BusinessMan(name:String, age:Int, gender:String, var annulIncome:Double):Parson(name, age, gender) {

    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Annul Income: $annulIncome")
    }
}