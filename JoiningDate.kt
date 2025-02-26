import kotlin.math.ceil
fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var(N,K) = readLine()!!.split(" ").map(String::toDouble)
        println((ceil(N/5)- ceil(K/5)).toInt())
    }
}
