fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (s,x,y,z) = readLine()!!.split(" ").map(String::toInt)
        if(s-(x+y)>=z)
        println(0)
        else if (s-x>=z || s-y>=z)
        println(1)
        else 
        println(2)
    }
}
