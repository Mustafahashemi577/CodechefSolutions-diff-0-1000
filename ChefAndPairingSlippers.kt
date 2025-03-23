import kotlin.math.*
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (n,l,x) = readLine()!!.split(" ").map(String::toInt)
        println(x*min(l,(n-l)))
    }
}
