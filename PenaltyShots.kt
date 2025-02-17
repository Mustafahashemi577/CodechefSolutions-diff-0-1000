fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        val A = readLine()!!.split(" ").map(String::toInt).toIntArray()
        var team1 = 0
        var team2 = 0
        for(i in 0..9){
            if(i%2==0){
                if(A[i]==1)
                    team1++
            }
            else{
                if(A[i]==1)
                    team2++
            }
        }
        if(team1==team2)
            println(0)
        else if (team2>team1)
            println(2)
        else
            println(1)
    }
}
