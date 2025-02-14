fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var(a,b,c,d) = readLine()!!.split(" ").map(String::toInt)
        if(a+c==180&&b+d==180)
            println("YES")
        else 
            println("NO")
    }
}
