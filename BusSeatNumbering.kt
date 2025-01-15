fun main(args : Array<String>){
    var t = readLine()!!.toInt()
    while(t-->0){
        var n = readLine()!!.toInt()
        if(n<=10)
            println("Lower Double")
        else if (n<=15)
            println("Lower Single")
        else if (n<=25)
            println("Upper Double")
        else
            println("Upper Single")
    }
}
