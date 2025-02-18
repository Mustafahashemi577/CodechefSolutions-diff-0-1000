fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var N = readLine()!!.toInt()
        var A = readLine()!!.split(" ").map(String::toInt).toIntArray()
        var holidays = 8
        for(i in 0..N-1){
            if(A[i]!=6&&A[i]!=7&&A[i]!=13&&A[i]!=14 && A[i]!=20 && A[i]!=21 && A[i]!=27 && A[i]!=28)
                holidays++
        }
        println(holidays)
    }
}
