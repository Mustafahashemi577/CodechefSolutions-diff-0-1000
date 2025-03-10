fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (z,y,a,b,c) = readLine()!!.split(" ").map(String::toInt)
        if(z-y>=a+b+c)
            println("YES")
        else
            println("NO")
    }
}
