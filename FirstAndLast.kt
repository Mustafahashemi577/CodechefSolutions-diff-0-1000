fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var N = readLine()!!.toInt()
        var A = readLine()!!.split(" ").map(String::toInt).toIntArray()
        var final = A[0]+A[N-1]
        var temp = 0
        for(j in 0 until (N-1))
        {
            temp = A[j] + A[j+1]
            if (temp > final)
                final = temp
        }
        println(final)
    }
}
