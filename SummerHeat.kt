import kotlin.math.*
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (a,b,c,d) = readLine()!!.split(" ").map(String::toInt)
        println(c/a+d/b)
    }
}
