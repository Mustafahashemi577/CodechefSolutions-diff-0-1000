fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (a,b,c) = readLine()!!.split(" ").map(String::toInt)
        if(a+b+c>=1&&a+b+c<3)
            println(1)
        else
            println(0)
    }    
}
