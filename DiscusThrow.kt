fun main(args : Array<String>){
    var t = readLine()!!.toInt()
    while(t-->0){
        readLine()!!.split(' ')!!.map{it.toInt()}!!.let{
            var a = it[0]
            var b = it[1]
            var c = it[2]
            println(maxOf(maxOf(a,b),c))
        }
    }
}
