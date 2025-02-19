fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var N = readLine()!!.toInt()
        var A = readLine()!!.split(" ").map(String::toInt).toIntArray()
        A.sort()
        var total = 0
        for(i in 1..N-1)
            total+=A[i]
        println(total)
    }
}
