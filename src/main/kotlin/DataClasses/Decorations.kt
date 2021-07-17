package DataClasses

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)
    val d2 = Decorations("slate")
    println(d2)
    val d3 = Decorations("slate")
    println(d3)
    println(d1.equals(d2))
    println(d3.equals(d2))
    val d4 = d3.copy()
    println(d3.equals(d4))
    val d5 = Decorations2("crystal", "wood", "diver")
    val (rock: String, wood: String, diver: String) = d5
    print(rock)
    print(wood)
    print(diver)
}

data class Decorations(val rocks: String) {}
data class Decorations2(val rocks:String, val wood: String, val diver: String)

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}
interface SpiceColor {
    val color: Color
    }
object YellowSpiceColor : SpiceColor {
    override val color = Color.BLUE
}
