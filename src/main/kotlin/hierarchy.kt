fun main(args: Array<String>) {
    var v : First
    v = Second()
    v.doJob()
//    var new = Outside.Inside() //class Inside()
   var new2 = Outside().Inside() //inner class Inside()
}
interface First {
   fun doJob() = print("First")
}
open class Second() : First {
}
//this is an example of polymorphism

//let's talk about модификаторы доступа
  // классы и методы всегда явл public по умолчанию
  // все классы по умолч final:
    //class Third(i: Int) : Second()
//наследовать можно только open классы:
class Third(i: Int) : Second()
//абстрактные классы
 abstract class Abs() {
     abstract fun myAbs()//нет тела
     fun myAbs2() {}
 }
//приватные методы
private class Priv(){
    private fun myPrivate() {}
}
//уровни доступа в Java: private, protected, default, public
//уровни доступа в Kotlin: public, private, protected, internal - на уровне модуля

//внутренние классы
class Outside() {
    //class Inside() //это аналог статическиго внутр класса //вернемся к main
    inner class Inside()
}