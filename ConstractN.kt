fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var N = readLine()!!.toInt()
        if(N==1 || N==3 || N==5)
            println("NO")
        else
            println("YES")
    }
}
