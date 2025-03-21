import kotlin.math.*
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var(n,m)=readLine()!!.split(" ").map(String::toInt)
        var b = abs(n-m)
        if(b%2==0)
            println("YES")
        else
            println("NO")
    }
}
