fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var n = readLine()!!.toInt()
        if(n>4){
            var temp = n/5
            println(n-temp)
        }
        else
        println(n)
    }
}
