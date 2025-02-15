fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (a,b,x,y) = readLine()!!.split(" ").map(String::toInt)
        var c = (a+0.0)/x
        var d = (b+0.0)/y
        if(c==d)
            println("Both")
        else if (c>d)
            println("Chefina")
        else 
            println("Chef")
            
    }
}
