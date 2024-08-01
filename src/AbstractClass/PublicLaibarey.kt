package AbstractClass

import Book.Book

class PublicLibrary : Library() {
    private val books = mutableListOf<Book>()

    override fun addBook(book: Book) {
        books.add(book)
    }

    override fun viewAllBooks() {
        if (books.isEmpty()) {
            println("No books available.")
        } else {
            for (book in books) {
                println("Title: ${book.title}, Author: ${book.author}, Year: ${book.year}")
            }
        }
    }

    override fun findBooksByAuthor(author: String) {
        val foundBooks = books.filter { it.author == author }
        if (foundBooks.isEmpty()) {
            println("No books found by author $author.")
        } else {
            for (book in foundBooks) {
                println("Title: ${book.title}, Author: ${book.author}, Year: ${book.year}")
            }
        }
    }
}
