import kotlin.math.*
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x,y,d)=readLine()!!.split(" ").map(String::toInt)
        if(abs(x-y)>d)
            println("NO")
        else 
            println("YES")
    }
}
