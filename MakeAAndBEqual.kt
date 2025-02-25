import kotlin.math.max
import kotlin.math.min
fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var(A,B) = readLine()!!.split(" ").map(String::toInt)
        var minAB = min(A,B)
        var maxAB = max(A,B)
        var flag = false
        while(minAB <= maxAB)
        {
            if (minAB == maxAB)  
            {
                flag = true
                break
            }    
            else
                minAB *=2
        }
        
        if (flag)
            println("Yes")
        else
            println("No")
    }
}
