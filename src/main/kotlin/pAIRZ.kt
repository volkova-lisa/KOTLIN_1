fun main(args: Array<String>) {
    val book = Book("a", "b", 1)
    print(book.titleAndAuthor().first)
}

class Book(val title: String, val author: String, val year: Int) {
    fun titleAndAuthor() : Pair<String, String> {
        return  title to author
    }
    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}
