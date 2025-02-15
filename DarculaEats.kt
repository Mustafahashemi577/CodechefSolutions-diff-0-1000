fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var n = readLine()!!.toInt()
        if(n%7>=2)
            println(n/7+1)
        else
            println(n/7)
    }
}
