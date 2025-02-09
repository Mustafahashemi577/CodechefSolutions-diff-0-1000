fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (a,x,b,y)=readLine()!!.split(" ").map(String::toInt)
        var c = (a+0.0)/x
        var d = (b+0.0)/y
        if(d==c)
            println("EQUAL")
        else if (c>d)
            println("ALICE")
        else 
            println("BOB")
    }
}
