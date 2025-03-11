fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (x1,x2,y1,y2) = readLine()!!.split(" ").map(String::toInt)
        var first = (y1+0.0)/x1
        var second = (y2+0.0)/x2
        if(first==second)
            println(0)
        else if (first<second)
            println(-1)
        else
            println(1)
    }
}
