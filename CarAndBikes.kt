fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var N = readLine()!!.toInt()
        if(N%4!=0)
            println("YES")
        else
            println("NO")
    }
}
