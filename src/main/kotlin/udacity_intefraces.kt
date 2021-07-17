fun main(args: Array<String>) {
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")
    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )
    val spicelist = spices1.filter {it.s < 5}
    for (n in spicelist) println("${n.name}") //чтооооооо заааа

}

abstract class SimpleSpice1() {
    val name = "curry"
    val spiceness = "mild"
    val heat: Int
        get() {return 5 }
}
class Spice1(val name: String, val heat: String = "mild") {
    public val s: Int
        get() {
            return when (heat) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    override fun toString(): String {
        return name
    }
}