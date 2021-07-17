fun main(a: Array<String>) {
    var p = Person("Max",22) //если принтить то будет белиберда, используем ключ слово data
    print(p)
}
data class Person(var name: String, var age: Int)
class MyCollection<T>(innerCollection: Collection<T> = ArrayList<T>()) : Collection<T> by innerCollection