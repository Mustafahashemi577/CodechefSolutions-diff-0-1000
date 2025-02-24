fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var n = readLine()!!.toInt()
        var divisors = IntArray(n)
        var i = 1
        var j = 0
        while(i <= n)
        {
            if (n%i == 0)
            {
                divisors[j] = i
                j++
            }
            i++
        }
        for(l in 0 until j)
        {
            print("${divisors[l]} ")
        }
        println()
    }
}
