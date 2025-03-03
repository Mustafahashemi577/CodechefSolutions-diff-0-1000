import kotlin.math.*
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x,y) = readLine()!!.split(" ").map(String::toInt)
        println(max(x,y)*2-1)
    }
}
