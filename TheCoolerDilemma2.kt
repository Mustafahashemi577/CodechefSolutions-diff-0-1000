fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var(x,y) = readLine()!!.split(" ").map(String::toInt)
        if(y%x!=0)
            println(y/x)
        else
            println(y/x-1)
        
    }
}
