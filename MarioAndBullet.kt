fun main(args : Array<String>){
    var t = readLine()!!.toInt()
    repeat(t){
        var (x,y,z) = readLine()!!.split(' ').map(String::toInt)
        var a = y/x
        if(z<=a)
            println(0)
        else
            println(z-a)
    }
}
