fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var (n,x,p) = readLine()!!.split(" ").map(String::toInt)
        var solved = x*3
        var result = solved-(n-x)
        if(result>=p)
            println("PASS")
        else
            println("FAIL")
    }
}
