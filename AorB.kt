import kotlin.math.max
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x,y) = readLine()!!.split(" ").map(String::toInt)
        var first = 500-(x*2)+1000-((x+y)*4)
        var second = 1000-(y*4)+500-((x+y)*2)
        println(max(first,second))
    }
}
