fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var n = readLine()!!.toInt()
        if(n%4==1)
            println("East")
        else if (n%4==2)
            println("South")
        else if (n%4==3)
            println("West")
        else
            println("North")
    }
}
