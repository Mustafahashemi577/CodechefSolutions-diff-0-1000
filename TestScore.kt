fun main(args : Array<String>){
    var t = readLine()!!.toInt()
    while(t-->0){
        readLine()!!.split(' ')!!.map{it.toInt()}!!.let{
            var n : Int = it[0]
            var x : Int = it[1]
            var y : Int = it[2]
            if(y%x==0&&x*n>=y)
                println("YES")
            else
                println("NO")
        }
    }
}
