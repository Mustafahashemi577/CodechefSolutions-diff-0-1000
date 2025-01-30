import kotlin.math.*
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x1,y1,x2,y2) = readLine()!!.split(" ").map(String::toInt)
        println(max(abs(x1-x2),abs(y2-y1)))
    }
}
