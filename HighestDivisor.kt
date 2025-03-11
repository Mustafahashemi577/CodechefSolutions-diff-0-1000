fun main(args:Array<String>){
    var n = readLine()!!.toInt()
    var maxdivide = 1
    for(i in 2 until 11){
        if(n%i==0&&i>maxdivide)
            maxdivide=i
    }
    println(maxdivide)
}
