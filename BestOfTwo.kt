
fun main(){
    val Testcases = readLine()!!.toInt()
    repeat(Testcases){
        val list = readLine()!!.split(" ").map { it.toInt()}
        val a = list.subList(0, 3).let { it.sum() - it.min()}
        val b = list.subList(3, 6).let { it.sum() - it.min()}
        println(if(a > b) "Alice" else if (b > a) "Bob" else "Tie")
    }
}
