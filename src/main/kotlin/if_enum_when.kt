fun main (a: Array<String>) {
    print(bigger(6,8))
    var d = Days.M
    var day = when(d) {
        Days.M, Days.W -> print("Monday")
        Days.T -> print("T")
    }
}
fun bigger (a:Int, b:Int) = if (a>b) a else b

enum class Days(i:Int){
    M(1), T(2), W(3);
    fun day(d:Days) {
        print(d)
    }

}