fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (a,b,x,y) = readLine()!!.split(" ").map(String::toInt)
        if(x==a && y==b || y==a && x==b)
            println(0)
        else if (x==a || x==b || y==a || y==b)
            println(1)
        else
        println(2)
    }
}
