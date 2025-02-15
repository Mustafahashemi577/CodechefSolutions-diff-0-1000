import kotlin.math.abs
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (a,b,k) = readLine()!!.split(" ").map(String::toInt)
        var diff = abs(a-b)
        if(diff==0)
            println(0)
        else{
            if(diff<=k)
                println(1)
            else if (diff%k==0)
                println(diff/k)
            else
                println(diff/k+1)
        }

    }
}
