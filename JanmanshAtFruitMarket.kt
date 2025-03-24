import kotlin.math.*
fun main(){
    repeat(readLine()!!.toInt()){
        val (x,a,b,c) = readLine()!!.split(" ").map(String::toInt)
        val d = arrayOf(a,b,c)
        d.sort()
        println(d[0]*(x-1)+d[1])
    }
}
