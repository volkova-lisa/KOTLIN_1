fun main(a: Array<String>) {

}

//open class A(var myAVar: Int) { //класс с конструктором == class A constructor (var i: Int)
//    var myIntVar : Int //нужно проиниц, используем блоки иниц-ции
//    init {
//        myIntVar = myAVar
//    }
//}

// конструкторы могут быть private
// конструкторы бывают праймари и секондари (внутри П находится В)
open class A {
    var myIntVar = 5
    constructor() {}
    constructor(myVar: Int) {
        var myIntVar = myVar
    }
}

class B : A {
    constructor() : super() {}
    constructor (myVar: Int) : super(myVar) {}
}