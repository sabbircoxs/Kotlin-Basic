package Book

fun main() {
    val library = PublicLibrary()

    library.addBook(Book("The", "George Orwell", 1949))
    library.addBook(Book("To Kill a Mockingbird", "Harper Lee", 1960))
    library.addBook(Book("Brave New World", "Aldous Huxley", 1932))

    println("********************************  All Book  ********************************")
    println("")
    library.viewAllBooks()

    println("********************************  Find Books By Author  ********************************")
    println("")
    library.findBooksByAuthor("George Orwell")
}