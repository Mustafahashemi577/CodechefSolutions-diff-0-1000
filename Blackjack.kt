fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (a,b) = readLine()!!.split(" ").map(String::toInt)
        var c = a+b
        if(c<11)
            println(-1)
        else
            println(21-c)
    }
}
