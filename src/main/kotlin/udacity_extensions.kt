import kotlin.random.Random

fun main(args: Array<String>) {
    val book1 = Books(125)
    val book2 = Books(120)
    book1.tornPages(3)
    book1.countWeight()
    print(book1.countWeight())
    val puppy = Puppy(book2)
    print(puppy.playWithBook(book2))
}

class Books(var pages: Int) {}

fun Books.countWeight() = 1.5 * pages
fun Books.tornPages(tornOut: Int) {
    pages -= tornOut
}

class Puppy(val someBook: Books) {
    fun playWithBook(someBook: Books) {
        someBook.tornPages(5)
        println(" text " + someBook.pages + " text ")
    }
}
