import kotlin.math.*
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var(a,b)=readLine()!!.split(" ").map(String::toInt)
        var d = abs(a-b)
        if(d%2==0)
            println("Yes")
        else
            println("No")
    }    
}
