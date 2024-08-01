package InterfaceClass

class Student: Persons {
    override var name: String = ""

    override fun sleep() {
        println("$name is sliping")
    }

    override fun work() {
        println("$name is Playing Football")
    }

    override fun study() {
        println("$name is studying")
    }

}