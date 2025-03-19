import kotlin.math.*
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (pa,pb,pc) = readLine()!!.split(" ").map(String::toInt)
        println(max(pa+pc,pb))
    }
}
