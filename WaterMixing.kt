import kotlin.math.*
fun main(args : Array<String>){
    repeat(readLine()!!.toInt()){
        var (a,b,x,y)=readLine()!!.split(" ").map(String::toInt)
        if(a==b)
            println("YES")
        else{
            if(a>b){
                if(abs(a-b)<=y)
                println("YES")
                else
                println("NO")
            }
            else{
                if(abs(a-b)<=x)
                println("YES")
                else 
                println("NO")
            }
        }
    }
}
