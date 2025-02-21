fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var(N,K) = readLine()!!.split(" ").map(String::toInt)
        var A = readLine()!!.split(" ").map(String::toInt).toIntArray()
        var count = 0
        for(j in 0 until N)
        {
            if(A[j] > K)
                count++
        }
        println(count)
    }
}
