import kotlin.math.*
fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x1,x2,x3,v1,v2) = readLine()!!.split(" ").map(String::toInt)
        var chef = (abs(x1-x3)+0.0)/v1
        var kefa = (abs(x2-x3)+0.0)/v2
        if(kefa==chef)
            println("Draw")
        else if (kefa>chef)
            println("Chef")
        else
            println("kefa")
    }
}
