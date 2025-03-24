import kotlin.math.*
fun main(){
    repeat(readLine()!!.toInt()){
        val (n,boys,k) = readLine()!!.split(" ").map(String::toInt)
        val girls = n-boys
        val remainingGirls = girls%k
        val remainingBoys = boys%k
        println(abs(remainingBoys-remainingGirls))
    }
}
