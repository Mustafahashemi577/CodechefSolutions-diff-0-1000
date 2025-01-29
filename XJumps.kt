import kotlin.math.*
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (a,b)= readLine()!!.split(" ").map(String::toInt)
        println(min((a/b)+(a%b),a))
    }
}
