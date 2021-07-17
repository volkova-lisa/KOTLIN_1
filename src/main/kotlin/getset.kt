fun main(a: Array<String>) {
    var ab = First1()
    ab.b = 3
    print(ab.b)

}

open class First1 {
    var b: Int = 4
        get() = field * 2
        set(c: Int) {
            print("setter called")
            field = c*3
        }
}

interface Second2 {
    abstract val d: Int
    val e: Int get() = d * 2

}

//class F(override val d: Int) : Second2 {
//
//}
class F : Second2 {
    override val d : Int get() = e / 2
}