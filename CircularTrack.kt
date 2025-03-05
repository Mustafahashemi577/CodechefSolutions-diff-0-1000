import kotlin.math.*
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (a,b,m) = readLine()!!.split(" ").map(String::toInt)
        var first = abs(b-a)
        var second =abs(m-first)
        println(min(first,second))
    }
}
