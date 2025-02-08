import kotlin.math.*

fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x,y) = readLine()!!.split(" ").map(String::toInt)
        var a = ceil(x/10.0).toInt()
        var b = ceil(y/10.0).toInt()
        println(abs(a-b))
    }
}
