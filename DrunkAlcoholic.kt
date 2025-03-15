fun main(args:Array<String>){
    repeat(readLine()!!.toInt()){
        var n = readLine()!!.toInt()
        var steps = 0
        for(i in 1 until n+1){
            if(i%2==1)
                steps+=3
            else
                steps-=1
        }
        println(steps)
    }
}
