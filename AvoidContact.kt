fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x,y) = readLine()!!.split(" ").map(String::toInt)
        if(y==0)
            println(x)
        else if(x==y)
            println(x+x-1)
        else
            println(y+y+(x-y))
    }
}
