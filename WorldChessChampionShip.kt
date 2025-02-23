fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var X = readLine()!!.toInt()
        var S = readLine()!!
        var chef = 0
        var carlsen = 0
        for(i in 0 until S.length){
            if(S[i]=='C')
                carlsen+=2
            else if(S[i]=='N')
                chef+=2
            else{
                chef++
                carlsen++
            }
        }
        if(chef>carlsen)
            println(40*X)
        else if (carlsen>chef)
            println(60*X)
        else
            println(55*X)
    }
}
