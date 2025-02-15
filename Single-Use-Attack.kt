fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var(h,x,y) = readLine()!!.split(" ").map(String::toInt)
        if((h-y)%x==0)
            println(1+(h-y)/x)
        else
            println(1+(h-y)/x+1)
    }
}
