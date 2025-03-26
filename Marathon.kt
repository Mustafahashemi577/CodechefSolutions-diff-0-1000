fun main(){
    repeat(readLine()!!.toInt()){
        var (D,d,a,b,c) = readLine()!!.split(" ").map(String::toInt)
        if(d*D>42)
            println(c)
        else if (d*D>=21)
            println(b)
        else if (d*D>=10)
            println(a)
        else
            println(0)
    }
}
