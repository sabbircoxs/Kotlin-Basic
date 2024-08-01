package OOP_Kotlin

class vehical (var model: String = "", var brand: String = "", var engine: String = "", var seat: Int = 0, var madein: String = ""){
    init {
        println("Vehicale model is: $model")
        println("Vehicale Brand is: $brand")
        println("Vehicale Engine is: $engine")
        println("Vehicale Seat is: $seat")
        println("Vehicale Medein is: $madein")
    }
    fun horn(){
        println("Sound is pip pip pip")
    }
}