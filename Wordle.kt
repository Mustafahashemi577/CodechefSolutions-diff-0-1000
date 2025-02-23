fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var S = readLine()!!
        var T = readLine()!!
        var M =""
        for(j in 0 until S.length){
            if(S[j]==T[j])
                M+="G"
            else
                M+="B"
        }
        println(M)
    }
}
