fun main (args: Array<String>) {
    print(message = 5)
    myDef()
    println("hello".lastMyChar)
    println("hello" Concat "world")
    println(myVarArg(1,2,3,4,5).get(1))


    var i = 3
    //somecode
  //  print(i+1)
    //morecode

    //somecode
  //  print(i+2)
    //morecode
    //kotlin helps to indicate local functions

    fun local(int: Int) {
        //somecode
        print(i+int)
        //morecode
    }
    local(1)
    local(2)
    //locals are for DRY - don't repeat yourself!!!!!!
}
fun myDef(s: String = "hello") {
     print(s)
}
val String.lastMyChar: Char get() = get(lastIndex)
infix fun String.Concat(other: String) = this + other //делать код более читабельным, например  to in is ...
fun myVarArg(vararg v: Int) : IntArray {
    var myArray = IntArray(v.size)
    for (i in 1..v.size-1) myArray.set(i, v.get(i))
    return myArray
}