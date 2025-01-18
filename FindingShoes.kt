fun main(args:Array<String>){
    var t = readLine()!!.toInt()
    repeat(t){
        var (n,m)= readLine()!!.split(" ").map(String::toInt)
        if(m>=n)
        println(n)
        else{
            var b = n-m
            println(b*2+m)
        }
    }
}
