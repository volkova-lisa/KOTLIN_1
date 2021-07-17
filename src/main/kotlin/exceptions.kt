import java.io.IOException
import java.lang.RuntimeException

fun main (a: Array<String>) {
    var i = try {
        throw IOException("io")
        throw RuntimeException("runtime")
        1
    }  catch(i : Exception){
        print("catch")
        2
    } finally {
        print("finally")
        3
    }
    print(i)
}