package Loop

fun main() {
    val n = 0
    var n1 = 0
    var n2 = 1

    print("First $n terms: ")

    for (i in 1..10) {
        print("$n1 + ")

        val sum = n1 + n2
        n1 = n2
        n2 = sum
    }
}