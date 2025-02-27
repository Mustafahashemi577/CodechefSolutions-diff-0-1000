fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var(D,N) = readLine()!!.split(" ").map(String::toInt)
        var ans = 0
        while(D>0){
            ans = N*(N+1)/2
            N=N*(N+1)/2
            D--
        }
        println(ans)
    }
}
